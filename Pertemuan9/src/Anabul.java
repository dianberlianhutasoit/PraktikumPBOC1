/* Nama File    : Anabul.java
Deskripsi       : Berisi atribut dan Method dalam Class Anabul
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 7 Mei 2026
LAB             : C1
*/

public class Anabul {
    /* --- ATRIBUT --- */ 
    private String panggilan;

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Anabul() {
        this.panggilan = "-";
    }

    // Konstruktor dengan parameter
    public Anabul(String Nama) {
        this.panggilan = Nama;
    }

    /* SELEKTOR */
    // Mengambil nama panggilan
    public String getNama() {
        return this.panggilan;
    }
    
    /* MUTATOR */
    // Mengubah atau menetapkan nilai panggilan
    public void setNama(String Nama) {
        this.panggilan = Nama;
    }

    /* METHOD LAIN */
    // Method dasar yang akan dioverride oleh kelas turunan
    public void Gerak() {
    }
    
    // Method dasar yang akan dioverride oleh kelas turunan
    public void Bersuara() {
    }
}