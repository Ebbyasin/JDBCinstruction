import org.junit.Assert;
import org.junit.Test;

import java.sql.*;

public class CountryTest02 {
     /* 
    Given 
      Kullanıcı veritabanına bağlanır 
 
    When 
      Kullanıcı, 'countries' tablosundan region_id'si 1 olan ülke adlarını almak üzere sorgu gönderir 
 
    Then 
      Kullanıcı, 1 nolu bölgeye ait ülkelerin sayısını doğrular 
 
    And 
      Kullanıcı, bağlantıyı kapatır 
    */

    @Test
    public void countryTest() throws SQLException {
        // Kullanıcı veritabanına bağlanır
        Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcnt_db","techpront","password");

        //Kullanıcı, 'countries' tablosundan ülke adlarını almak üzere sorgu gönderir
        Statement st=con.createStatement();

        String sql="SELECT country_name FROM countries WHERE region_id=1";

        ResultSet rs=st.executeQuery(sql);

        //Kullanıcı, 1 nolu bölgeye ait ülkelerin sayısının 8 oldugunu dogrular
        int actualData=0;
        while (rs.next()){
            actualData++;
        }

        int expectedData=8;

        Assert.assertEquals(8,actualData);

        // Kullanıcı, bağlantıyı kapatır
        st.close();
        con.close();


    }
}
