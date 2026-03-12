/* Nama File    : BangunDatar.java
Deskripsi       : Berisi atribut dan Method dalam Class Bangun Datar
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 6 Maret 2026
LAB             : C1
*/

public class Persegi extends BangunDatar {
    /* ATRIBUT */
    private double sisi;

    /* METHOD */

    public Persegi()
    {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    // SELEKTOR
    public double getSisi()
    {
        return this.sisi;
    }

    public double getLuas()
    {
        return this.sisi * this.sisi;
    }

    public double getKeliling()
    {
        return 4 * this.sisi;
    }

    public double getDiagonal()
    {
        return this.sisi * Math.sqrt(2);
    }

    // MUTATOR
    public void setSisi(double sisi)
    {
        this.sisi = sisi;
    }


    @Override
    public void printInfo()
    {
        super.printInfo(); 
        System.out.println("Sisi: " + this.sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
    
}