/* Nama File    : Persegi.java
Deskripsi       : Berisi atribut dan Method dalam Class Bangun Datar
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 12 Maret 2026
LAB             : C1
*/

public class Persegi extends BangunDatar implements IResize{
    /* --- ATRIBUT --- */ 
    private double sisi;

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Persegi()
    {
        super();
        setJmlSisi(4);
    }

    // Konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }
    
    /* SELEKTOR */
    public double getSisi()
    {
        return this.sisi;
    }
    
    /* MUTATOR */
    public void setSisi(double sisi)
    {
        this.sisi = sisi;
    }

    // IMPLEMENTASI ABSTRACT METHOD DARI BangunDatar
    @Override
    public double getLuas()
    {
        return this.sisi * this.sisi;
    }

    @Override
    public double getKeliling()
    {
        return 4 * this.sisi;
    }

    // IMPLEMENTASI METHOD dari Interface IResize
   
    // Menambah ukuran sisi menjadi 10% lebih besar
    @Override
    public void zoomIn() { 
        this.sisi = this.sisi * 1.1; 
    }

    // Mengurangi ukuran sisi menjadi 10% lebih kecil
    @Override
    public void zoomOut() { 
        this.sisi = this.sisi * 0.9; 
    }

    // Menskalakan ukuran sisi sesuai input an
    public void zoom(int percent) { 
        this.sisi = this.sisi * percent / 100; 
    }


    /* METHOD LAIN */

    public void printInfo()
    {
        super.printInfo(); 
        System.out.println("Sisi: " + this.sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
    
}


