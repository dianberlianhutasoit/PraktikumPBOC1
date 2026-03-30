/* Nama File    : BangunDatar.java
Deskripsi       : Berisi atribut dan Method dalam Class Bangun Datar (Abstract)
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 26 Maret 2026
LAB             : C1
*/

public abstract class BangunDatar {
    /* --- ATRIBUT --- */   
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter 
    public BangunDatar()
    {
        this.jmlSisi = 0;
        this.warna = "-";
        this.border = "-";
        counterBangunDatar++;
    }

    // Konstruktor dengan parameter 
    public BangunDatar(int jmlSisi, String warna, String border)
    {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }
    
    /* SELEKTOR */
    // Mengambil nilai jumlah sisi
    public int getJmlSisi()
    {
        return jmlSisi;
    }
    
    // Mengambil nilai warna
    public String getWarna()
    {
        return warna;
    }
    
    // Mengambil nilai border
    public String getBorder()
    {
        return border;
    }
    
    /* MUTATOR */
    // Mengubah atau menetapkan nilai jumlah sisi
    public void setJmlSisi(int jmlSisi)
    {
        this.jmlSisi = jmlSisi;
    }
    
    // Mengubah atau menetapkan nilai warna
    public void setWarna(String warna)
    {
        this.warna = warna;
    }
    
    // Mengubah atau menetapkan nilai border
    public void setBorder(String border)
    {
        this.border = border;
    }
    
    /* ABSTRACT METHOD */
    // Menghitung luas bangun datar 
    public abstract double getLuas();

    // Menghitung keliling bangun datar 
    public abstract double getKeliling();

    // Mencetak jumlah objek yang sudah dibuat 
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar : " + counterBangunDatar);
    }
    

    /* METHOD LAIN */
    // Mencetak informasi umum bangun datar
    public void printInfo()
    {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    /* Method Perbandingan */ 

    // Mengecek apakah luas objek ini sama dengan objek lain
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    // Mengecek apakah keliling objek ini sama dengan objek lain
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }  
}