/* Nama File    : BangunDatar.java
Deskripsi       : Berisi atribut dan Method dalam Class Bangun Datar
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 12 Maret 2026
LAB             : C1
*/

public class BangunDatar {
    /* ATRIBUT */   
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    /* METHOD */

    /* KONSTRUKTOR */
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

    // Mencetak jumlah objek bangun datar
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar : " + counterBangunDatar);
    }

    /* SELEKTOR */
    // Mengembalikan Jumlah Sisi
    public int getJmlSisi()
    {
        return jmlSisi;
    }

    // Mengembalikan nilai warna
    public String getWarna()
    {
        return warna;
    }
     
    // Mengembalikan nilai border
    public String getBorder()
    {
        return border;
    }
    
    /* MUTATOR */
    // Mengubah atau menetapkan jumlah sisi
    public void setJmlSisi(int jmlSisi)
    {
        this.jmlSisi = jmlSisi;
    }
    
    // Mengubah atau menetapkan warna
    public void setWarna(String warna)
    {
        this.warna = warna;
    }
    
    // Mengubah atau menetapkan border
    public void setBorder(String border)
    {
        this.border = border;
    }

    /* METHOD LAIN */
    // Mencetak informasi umum Bangun datar
    public void printInfo()
    {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

}