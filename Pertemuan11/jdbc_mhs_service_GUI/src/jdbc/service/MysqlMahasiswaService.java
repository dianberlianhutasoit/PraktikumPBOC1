/* Nama File    : MysqlMahasiswaService.java
Deskripsi       : Implementasi layanan CRUD Mahasiswa ke database
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 8 Mei 2026
LAB             : C1
*/

package jdbc.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {
    /* --- ATRIBUT --- */
    Connection koneksi = null;

    /* --- METHOD --- */
    
    /* KONSTRUKTOR */
    // Memanggil koneksi database
    public MysqlMahasiswaService() {
        this.koneksi = MysqlUtility.getConnection();
    }

    /* METHOD LAINNYA */

    // Menambah data mahasiswa baru ke database
    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa (nama) VALUES (?)";

        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.executeUpdate();

            System.out.println("Berhasil insert");
        } catch (SQLException e) {
            System.out.println("Gagal insert: " + e.getMessage());
        }
    }

    // Mengganti nama mahasiswa yang sudah ada di database
    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Berhasil update");
        } catch (SQLException e) {
            System.out.println("Gagal update: " + e.getMessage());
        }
    }

    // Menghapus data mahasiswa dari database berdasarkan id
    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Berhasil delete");
        } catch (SQLException e) {
            System.out.println("Gagal delete: " + e.getMessage());
        }
    }

    // Mengambil data satu mahasiswa sesuai pencarian id
    public Mahasiswa getById(int id) {
        String query = "SELECT * FROM mahasiswa WHERE id = ?";
        Mahasiswa mhs = null;
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
            }
        } catch (SQLException e) {
            System.out.println("Gagal ambil data: " + e.getMessage());
        }
        return mhs;
    }

    // Mengambil seluruh koleksi data mahasiswa dalam bentuk List
    public List<Mahasiswa> getAll() {
        String query = "SELECT * FROM mahasiswa";
        List<Mahasiswa> list = new ArrayList<>();
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
                list.add(mhs);
            }
        } catch (SQLException e) {
            System.out.println("Gagal ambil semua data: " + e.getMessage());
        }
        return list;
    }
    
    // Method untuk mereset nilai auto increment pada tabel mahasiswa
    public void indexReset() {
        String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try {
            Statement statement = koneksi.createStatement(); // Membuat statement untuk menjalankan query SQL
            statement.executeUpdate(query); // Menjalankan query reset auto increment
            System.out.println("Berhasil reset indeks");
        } 
        catch (SQLException e) {
            System.out.println("Gagal reset indeks: " + e.getMessage());
        }
    }   
}