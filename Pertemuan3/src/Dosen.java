/* Nama File    : Dosen.java
Deskripsi       : Berisi atribut dan Method dalam Class Dosen
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 6 Maret 2026
LAB             : C1
*/

public class Dosen {
    /* --- ATRIBUT ---  */
    private String NIP;          // Menyimpan NIP dosen
    private String Nama;        // Menyimpan nama dosen
    private String Prodi;       // Menyimpan program studi dosen

    /* --- METHOD --- */

    /* Konstruktor */ 

    // Konstruktor tanpa parameter untuk membuat objek dosen dengan nilai awal "-"
    public Dosen() {      
        this.NIP = "-";
        this.Nama = "-";
        this.Prodi = "-";
    }

    // Konstruktor dengan parameter untuk membuat objek dosen sesuai dengan nilai yang diinput
    public Dosen(String NIP, String Nama, String Prodi) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    /* Selektor */

    // Method untuk mengambil nilai NIP dosen
    public String getNIP() {
        return NIP;
    }

    // Method untuk mengambil nilai Nama dosen
    public String getNama() {
        return Nama;
    }

    // Method untuk mengambil nilai Program Studi dosen
    public String getProdi() {
        return Prodi;
    }

    /* Mutator */

    // Method untuk mengubah atau menetapkan nilai NIP dosen
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    // Method untuk mengubah atau menetapkan nilai Nama dosen
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    // Method untuk mengubah atau menetapkan nilai Program Studi dosen
    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    /* Method Lain */

    // Method untuk menampilkan informasi dosen 
    public void printDosen() {
        System.out.println("NIP : " + NIP + "," + " Nama : " + Nama + "," + " Prodi : " + Prodi );
    }
}
