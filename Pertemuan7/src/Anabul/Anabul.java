package Anabul;

/* Nama File    : Anabul.java
Deskripsi       : Berisi atribut dan Method dalam Class Anabul
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 28 April 2026
LAB             : C1
*/

public class Anabul {
    /* --- ATRIBUT --- */ 
    private String Nama;

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Anabul() {
        this.Nama = "";
    }

    // Konstruktor dengan parameter
    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    /* SELEKTOR */
    // Mengambil nilai Nama
    public String getNama() {
        return this.Nama;
    }
    
    /* MUTATOR */
    // Mengubah atau menetapkan nilai Nama
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /* METHOD LAIN */
    // Method dasar yang akan dioverride oleh kelas turunan
    public void Gerak() {
    }
    
    // Method dasar yang akan dioverride oleh kelas turunan
    public void Bersuara() {
    }
}