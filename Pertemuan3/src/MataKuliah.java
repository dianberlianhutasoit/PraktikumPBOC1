/* Nama File    : MataKuliah.java
Deskripsi       : Berisi atribut dan Method dalam Class Mata Kuliah
Pembuat         : Dian Berlian Hutasoit
LAB             : C1
*/

public class MataKuliah {
    /* --- ATRIBUT --- */
    private String idMatkul;
    private String Nama;
    private int SKS;

    /* --- METHOD --- */
    
    // KONSTRUKTOR
    public MataKuliah() {
        this.idMatkul = "-";
        this.Nama = "-";
        this.SKS = 0;
    }

    public MataKuliah(String idMatkul, String Nama, int SKS) {
        this.idMatkul = idMatkul;
        this.Nama = Nama;
        this.SKS = SKS;
    }

    // SELEKTOR
    public String getID() {
        return idMatkul;
    }

    public String getNama() {
        return Nama;
    }

    public int getSKS() {
        return SKS;
    }

    // MUTATOR
    public void setID(String idMatkul) {
        this.idMatkul = idMatkul;
    }  

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    public void printMatkul() {
        System.out.println("ID Matkul : " + idMatkul + "," + " Nama : " + Nama + "," + " SKS : " + SKS);
    }
}