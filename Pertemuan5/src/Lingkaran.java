/* Nama File    : Lingkaran.java
Deskripsi       : Berisi atribut dan Method dalam Class Bangun Datar
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 12 Maret 2026
LAB             : C1
*/

public class Lingkaran extends BangunDatar implements IResize {
    /* --- ATRIBUT --- */ 
    private double jari;

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    public Lingkaran() {
        super();
        setJmlSisi(0);
    }

    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    /* SELEKTOR */
    public double getJari() {
        return this.jari;
    }
    
    /* MUTATOR */
    public void setJari(double jari) {
        this.jari = jari;
    }

    // IMPLEMENTASI ABSTRACT METHOD DARI BangunDatar
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    // IMPLEMENTASI METHOD dari Interface IResize
    
    // Menambah ukuran sisi menjadi 10% lebih besar
    @Override
    public void zoomIn() {
        this.jari = this.jari * 1.1;
    }

    // Mengurangi ukuran sisi menjadi 10% lebih kecil
    @Override
    public void zoomOut() {
        this.jari = this.jari * 0.9;
    }

    // Menskalakan ukuran sisi sesuai input an
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



