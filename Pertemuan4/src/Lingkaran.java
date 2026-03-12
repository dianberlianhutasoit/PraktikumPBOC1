/* Nama File    : BangunDatar.java
Deskripsi       : Berisi atribut dan Method dalam Class Bangun Datar
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 6 Maret 2026
LAB             : C1
*/

public class Lingkaran extends BangunDatar {
    /* ATRIBUT */
    private double jari;

    /* METHOD */

    // KONSTRUKTOR
    public Lingkaran() {
        super();
        setJmlSisi(0);
    }

    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    // SELEKTOR
    public double getJari() {
        return jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    // MUTATOR
    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + jari);
        System.out.println("Luas Lingkaran : " + getLuas());
        System.out.println("Keliling Lingkaran : " + getKeliling());
    }
}