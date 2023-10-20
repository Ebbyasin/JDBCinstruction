import org.junit.Assert;
import org.junit.Test;

import java.sql.*;

public class CountryTest01 {

    /*
    Given =Hazırlık işlemleri
      Kullanıcı veritabanına bağlanır

    When =Eylem ile ilgili işlemler
      Kullanıcı, 'countries' tablosundan ülke adlarını almak üzere sorgu gönderir

    Then =Doğrulamalar (Assertion) işlemlerinde kullanılır
      Kullanıcı, country_name sütununda en az bir ülke adı olduğunu doğrular

    And = Kendisinden önceki anahtar kelimenin devamını ifade etmek için kullanılır
      Kullanıcı, Bağlantıyı kapatır
    */

    @Test
    public void countryTest() throws SQLException {
        // Kullanıcı veritabanına bağlanır
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcnt_db","techpront","password");

        //Kullanıcı, 'countries' tablosundan ülke adlarını almak üzere sorgu gönderir
        Statement st=con.createStatement();

        String sql="SELECT country_name FROM countries";

        ResultSet rs=st.executeQuery(sql);

        //Kullanıcı ,country_name sütununda en az bir ülke adı olduğunu doğrular
        int ulkeSayisi=0;
        while (rs.next()){
            ulkeSayisi++;
        }

        Assert.assertTrue(ulkeSayisi>0);

        //Kullanıcı,Bağlantıyı kapatır
        st.close();
        con.close();

    }


}
