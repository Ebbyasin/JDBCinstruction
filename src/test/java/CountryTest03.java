import org.junit.Assert;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CountryTest03 {
     /*
    Given
      Kullanıcı veritabanına bağlanır

    When
      Kullanıcı, 'countries' tablosundan region_id'si 1 olan ülke adlarını almak üzere sorgu gönderir

    Then
      Kullanıcı, ülke isimlerini doğrular: "Belgium", "Switzerland", "Germany", "Denmark", "France", "Italy", "Netherlands", "United Kingdom"

    And
      Kullanıcı, bağlantıyı kapatır
    */

    @Test
    public void countryTest() throws SQLException {
        // Kullanıcı veritabanına bağlanır
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcnt_db", "techpront", "password");

        //Kullanıcı, 'countries' tablosundan ülke adlarını almak üzere sorgu gönderir
        Statement st = con.createStatement();
        String sql = "select country_name from countries where region_id = 1";
        ResultSet rs = st.executeQuery(sql);
        // Kullanıcı, ülke isimlerini doğrular
        List<String> actualData = new ArrayList<>();
        while (rs.next()){
            String ulkeAdi = rs.getString("country_name"); // Belgium, Switzerland, ...
            actualData.add(ulkeAdi);
        }

        List<String> expectedData = List.of("Belgium", "Switzerland", "Germany", "Denmark", "France", "Italy", "Netherlands", "United Kingdom");
        Assert.assertEquals(expectedData, actualData);
        // Kullanıcı, bağlantıyı kapatır
        st.close();
        con.close();




    }

    }
