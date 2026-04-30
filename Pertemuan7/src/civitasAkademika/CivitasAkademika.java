package civitasAkademika;

/* Nama File    : Civitasakademika.java
Deskripsi       : Berisi atribut dan Method dalam Class Civitasakademika
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 28 April 2026
LAB             : C1
*/

public class CivitasAkademika {
    /* --- ATRIBUT --- */ 
    private String Nama;

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public CivitasAkademika() {
        this.Nama = "";
    }

    // Konstruktor dengan parameter
    public CivitasAkademika(String Nama) {
        this.Nama = Nama;
    }

    /* SELEKTOR */
    // Mengambil nilai Nama
    public String getNama() {
        return this.Nama;
    }

    // Method dasar untuk mengambil nomor identitas
    public String getNomor() {
        return "";
    }
    
    /* MUTATOR */
    // Mengubah atau menetapkan nilai Nama
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
}