/* Nama File    : MataKuliah.java
Deskripsi       : Berisi atribut dan Method dalam Class Mata Kuliah
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 6 Maret 2026
LAB             : C1
*/

public class MataKuliah {
    /* --- ATRIBUT --- */
    private String idMatkul;
    private String Nama;
    private int SKS;

    /* --- METHOD --- */
    
    /* KONSTRUKTOR */

    // Konstruktor tanpa parameter untuk membuat objek mata kuliah dengan nilai awal
    public MataKuliah() {
        this.idMatkul = "-";
        this.Nama = "-";
        this.SKS = 0;
    }

    // Konstruktor dengan parameter untuk membuat objek mata kuliah sesuai dengan nilai yang diinput
    public MataKuliah(String idMatkul, String Nama, int SKS) {
        this.idMatkul = idMatkul;
        this.Nama = Nama;
        this.SKS = SKS;
    }

    /* SELEKTOR */

    // Method untuk mengambil nilai ID mata kuliah
    public String getID() {
        return idMatkul;
    }

    // Method untuk mengambil nama mata kuliah
    public String getNama() {
        return Nama;
    }

    // Method untuk mengambil jumlah SKS mata kuliah
    public int getSKS() {
        return SKS;
    }

    /* MUTATOR */

    // Method untuk mengubah atau menetapkan ID mata kuliah
    public void setID(String idMatkul) {
        this.idMatkul = idMatkul;
    }  

    // Method untuk mengubah atau menetapkan nama mata kuliah
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    // Method untuk mengubah atau menetapkan jumlah SKS mata kuliah
    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    /* Method Lain */
    
    // Method untuk menampilkan informasi mata kuliah ke layar
    public void printMatkul() {
        System.out.println("ID Matkul : " + idMatkul + "," + " Nama : " + Nama + "," + " SKS : " + SKS);
    }
}