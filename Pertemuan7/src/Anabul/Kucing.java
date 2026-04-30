package Anabul;

/* Nama File    : Kucing.java
Deskripsi       : Berisi atribut dan Method dalam Class Kucing
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 28 April 2026
LAB             : C1
*/

public class Kucing extends Anabul {
    /* --- ATRIBUT --- */ 
    // Mewarisi atribut dari class Anabul

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Kucing() {
        super();
    }

    // Konstruktor dengan parameter
    public Kucing(String Nama) {
        super(Nama);
    }

    /* SELEKTOR */
    // Mewarisi selektor dari class Anabul
    
    /* MUTATOR */
    // Mewarisi mutator dari class Anabul

    /* IMPLEMENTASI METHOD DARI Anabul (OVERRIDING) */
    // Menampilkan gerakan spesifik Kucing
    @Override
    public void Gerak() {
        System.out.println("Kucing melata");
    }

    // Menampilkan suara spesifik Kucing
    @Override
    public void Bersuara() {
        System.out.println("Meong");
    }
}