/* Nama File    : Kendaraan.java
Deskripsi       : Berisi atribut dan Method dalam Class Kendaraan
Pembuat         : Dian Berlian Hutasoit
LAB             : C1
*/

public class Kendaraan {
    /* --- ATRIBUT --- */
    private String noPlat;
    private String Jenis;

    /* --- METHOD --- */
    // KONSTRUKTOR
    public Kendaraan() {
        this.noPlat = "-";
        this.Jenis = "-";
    }

    public Kendaraan(String noPlat, String Jenis) {
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    //SELEKTOR
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return Jenis;
    }

    //MUTATOR
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public void printKendaraan() {
        System.out.println("No. Plat Kendaraan : " + noPlat + "," + " Jenis : " + Jenis);
    }
}