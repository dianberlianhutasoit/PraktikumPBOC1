/* Nama File    : BangunDatar.java
Deskripsi       : Berisi atribut dan Method dalam Class Bangun Datar
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 6 Maret 2026
LAB             : C1
*/

public class BangunDatar {
    /* ATRIBUT */   
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    /* METHOD */
    // Konstruktor tanpa parameter 
    public BangunDatar()
    {
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

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar : " + counterBangunDatar);
    }

    // SELEKTOR
    public int getJmlSisi()
    {
        return jmlSisi;
    }

    
    public String getWarna()
    {
        return warna;
    }
     
    public String getBorder()
    {
        return border;
    }
    
    // MUTATOR
    
    public void setJmlSisi(int jmlSisi)
    {
        this.jmlSisi = jmlSisi;
    }
    
    public void setWarna(String warna)
    {
        this.warna = warna;
    }
    
    public void setBorder(String border)
    {
        this.border = border;
    }

    /* METHOD LAIN */
    
    public void printInfo()
    {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

}