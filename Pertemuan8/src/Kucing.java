/* Nama File    : Kucing.java
Deskripsi       : Berisi atribut dan Method dalam Class Kucing
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 5 Mei 2026
LAB             : C1
*/

public class Kucing extends Anabul {
    /* --- ATRIBUT --- */ 
    private double bobot; // Tambahan atribut bobot (kg)

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    public Kucing() {
        super();
        this.bobot = 0.0;
    }

    public Kucing(String Nama, double bobot) {
        super(Nama);
        this.bobot = bobot;
    }

    /* SELEKTOR */
    public double getBobot() {
        return this.bobot;
    }
    
    /* MUTATOR */
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    /* IMPLEMENTASI METHOD DARI Anabul (OVERRIDING) */
    @Override
    public void Gerak() {
        System.out.println("Kucing melata");
    }

    @Override
    public void Bersuara() {
        System.out.println("Meong");
    }
}