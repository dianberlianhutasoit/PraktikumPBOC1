package Anabul;

/* Nama File    : Burung.java
Deskripsi       : Berisi atribut dan Method dalam Class Burung
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 28 April 2026
LAB             : C1
*/

public class Burung extends Anabul {
    /* --- ATRIBUT --- */ 
    // Mewarisi atribut dari class Anabul

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Burung() {
        super();
    }

    // Konstruktor dengan parameter
    public Burung(String Nama) {
        super(Nama);
    }

    /* SELEKTOR */
    // Mewarisi selektor dari class Anabul
    
    /* MUTATOR */
    // Mewarisi mutator dari class Anabul

    /* IMPLEMENTASI METHOD DARI Anabul (OVERRIDING) */
    // Menampilkan gerakan spesifik Burung
    @Override
    public void Gerak() {
        System.out.println("Burung terbang");
    }

    // Menampilkan suara spesifik Burung
    @Override
    public void Bersuara() {
        System.out.println("Cuit");
    }
}