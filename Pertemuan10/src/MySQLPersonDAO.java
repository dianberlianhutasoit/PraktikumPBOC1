/* Nama File    : MySQLPersonDAO.java
Deskripsi       : Implementasi PersonDAO untuk MySQL
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 25 Mei 2026
LAB             : C1
*/

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    /* --- METHOD --- */

    // Menyimpan data objek Person ke tabel database MySQL
    @Override
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/pbo", "root", "");

        String query = "INSERT INTO person (name) VALUES ('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);

        con.close();
    }
}