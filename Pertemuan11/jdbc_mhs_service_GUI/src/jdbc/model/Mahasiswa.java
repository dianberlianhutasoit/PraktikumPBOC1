/* Nama File    : Mahasiswa.java
Deskripsi       : Kelas model POJO untuk objek Mahasiswa
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 8 Mei 2026
LAB             : C1
*/

package jdbc.model;

public class Mahasiswa {
    /* --- ATRIBUT --- */
    private int id;
    private String nama;

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.id = 0;
        this.nama = "";
    }

    // Konstruktor dengan parameter
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    /* SELEKTOR & MUTATOR */

    // Mengembalikan nilai id
    public int getId() {
        return this.id;
    }

    // Mengubah atau mengeset nilai id
    public void setId(int id) {
        this.id = id;
    }

    // Mengembalikan nama mahasiswa
    public String getNama() {
        return this.nama;
    }

    // Mengubah atau mengeset nama mahasiswa
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengonversi objek komponen menjadi string 
    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + '}';
    }
}