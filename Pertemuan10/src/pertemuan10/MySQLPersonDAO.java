package pertemuan10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySQLPersonDAO implements PersonDAO {
    @Override
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        
        // Load driver MySQL 8 yang kamu miliki
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Kredensial database pbo sesuai setup milikmu
        String url = "jdbc:mysql://localhost:3306/pbo";
        String user = "root";
        String password = "Informatics_18"; 
        
        Connection con = DriverManager.getConnection(url, user, password);
        
        // Query SQL untuk menyimpan data
        String query = "INSERT INTO person (name) VALUES ('" + name + "')";
        System.out.println("Menjalankan query: " + query);
        
        Statement s = con.createStatement();
        s.executeUpdate(query);
        
        // Menutup koneksi setelah selesai digunakan
        s.close();
        con.close();
    }
}