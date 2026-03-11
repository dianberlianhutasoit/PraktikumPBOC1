/* Nama File    : Kendaraan.java
Deskripsi       : Berisi atribut dan Method dalam Class Kendaraan
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 6 Maret 2026
LAB             : C1
*/

public class Kendaraan {
    /* --- ATRIBUT --- */
    private String noPlat;
    private String Jenis;

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter untuk membuat objek kendaraan dengan nilai awal "-"
    public Kendaraan() {
        this.noPlat = "-";
        this.Jenis = "-";
    }

    // Konstruktor dengan parameter untuk membuat objek kendaraan dengan nilai yang diinput
    public Kendaraan(String noPlat, String Jenis) {
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    /* SELEKTOR */

    // Method untuk mengambil nilai nomor plat kendaraan
    public String getNoPlat() {
        return noPlat;
    }

    // Method untuk mengambil nilai jenis kendaraan
    public String getJenis() {
        return Jenis;
    }

    /* MUTATOR */

    // Method untuk mengubah atau menetapkan nomor plat kendaraan
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    // Method untuk mengubah atau menetapkan jenis kendaraan
    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    /* Method Lain */
    // Method untuk menampilkan informasi kendaraan 
    public void printKendaraan() {
        System.out.println("No. Plat Kendaraan : " + noPlat + "," + " Jenis : " + Jenis);
    }
}