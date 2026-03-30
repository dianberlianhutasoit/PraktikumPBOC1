/* Nama File    : BangunDatar.java
Deskripsi       : Berisi atribut dan Method dalam Class Bangun Datar
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 12 Maret 2026
LAB             : C1
*/

public class Lingkaran extends BangunDatar {
    /* ATRIBUT */
    private double jari;

    /* METHOD */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Lingkaran() {
        super();
        setJmlSisi(0);
    }

    // Konstruktor dengan parameter
    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    /* SELEKTOR */
    // Mengembalikan nilai jari-jari 
    public double getJari() {
        return jari;
    }

    // Mengembalikan nilai luas
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // Mengembalikan nilai keliling
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    /* MUTATOR */
    // Mengubah atau menetapkan nilai jari-jari
    public void setJari(double jari) {
        this.jari = jari;
    }

    // Mencetak informasi lengkap Lingkaran
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + jari);
        System.out.println("Luas Lingkaran : " + getLuas());
        System.out.println("Keliling Lingkaran : " + getKeliling());
    }
}