/* Nama File    : Lingkaran.java
Deskripsi       : Berisi atribut dan Method dalam Class Lingkaran
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 12 Maret 2026
LAB             : C1
*/

public class Lingkaran extends BangunDatar implements IResize {
    /* --- ATRIBUT --- */ 
    private double jari;

    /* --- METHOD --- */

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
    // Mengambil nilai jari-jari
    public double getJari() {
        return this.jari;
    }
    
    /* MUTATOR */
    // Mengubah atau menetapkan nilai jari-jari
    public void setJari(double jari) {
        this.jari = jari;
    }

    /* IMPLEMENTASI ABSTRACT METHOD DARI BangunDatar */
    // Menghitung Luas Lingkaran
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // Menghitung Keliling Lingkaran
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    /* IMPLEMENTASI METHOD dari Interface IResize */
    // Menambah ukuran jari-jari menjadi 10% lebih besar
    @Override
    public void zoomIn() {
        this.jari = this.jari * 1.1;
    }

    // Mengurangi ukuran jari-jari menjadi 10% lebih kecil
    @Override
    public void zoomOut() {
        this.jari = this.jari * 0.9;
    }

    // Menskalakan ukuran jari-jari sesuai input an
    @Override
    public void zoom(int percent) {
        this.jari = this.jari * percent / 100.0;
    }

    /* METHOD LAIN */
    // Mencetak informasi umum Lingkaran
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + jari);
        System.out.println("Luas Lingkaran : " + getLuas());
        System.out.println("Keliling Lingkaran : " + getKeliling());
    }
}