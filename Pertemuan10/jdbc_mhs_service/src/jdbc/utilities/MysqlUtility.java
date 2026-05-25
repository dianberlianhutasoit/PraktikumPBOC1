/* Nama File    : MysqlUtility.java
Deskripsi       : Mengatur koneksi ke database menggunakan JDBC
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 8 Mei 2026
LAB             : C1
*/

package jdbc.utilities;

import java.sql.*;

public class MysqlUtility {
    /* --- ATRIBUT --- */
    private static Connection koneksi;

    /* --- METHOD --- */

    // Mengembalikan status koneksi ke database
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs_service";
                String user = "root";
                String password = "";

                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver: " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal koneksi: " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}