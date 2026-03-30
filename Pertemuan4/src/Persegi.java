/* Nama File    : BangunDatar.java
Deskripsi       : Berisi atribut dan Method dalam Class Bangun Datar
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 12 Maret 2026
LAB             : C1
*/

public class Persegi extends BangunDatar {
    /* ATRIBUT */
    private double sisi;

    /* METHOD */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Persegi()
    {
        setJmlSisi(4);
    }

    // Konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    /* SELEKTOR */
    // Mengembalikan nilai sisi 
    public double getSisi()
    {
        return this.sisi;
    }

    // Mengembalikan nilai luas
    public double getLuas()
    {
        return this.sisi * this.sisi;
    }

    // Mengembalikan nilai keliling
    public double getKeliling()
    {
        return 4 * this.sisi;
    }

    // Mengembalikan nilai diagonal
    public double getDiagonal()
    {
        return this.sisi * Math.sqrt(2);
    }

    /* MUTATOR */
    // Mengubah atau menetapkan nilai sisi
    public void setSisi(double sisi)
    {
        this.sisi = sisi;
    }

    /* METHOD LAINNYA */
    // Mencetak informasi lengkap persegi
    @Override
    public void printInfo()
    {
        super.printInfo(); 
        System.out.println("Sisi: " + this.sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
    
}