package Anabul;

/* Nama File    : Anjing.java
Deskripsi       : Berisi atribut dan Method dalam Class Anjing
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 28 April 2026
LAB             : C1
*/

public class Anjing extends Anabul {
    /* --- ATRIBUT --- */ 
    // Mewarisi atribut dari class Anabul

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Anjing() {
        super();
    }

    // Konstruktor dengan parameter
    public Anjing(String Nama) {
        super(Nama);
    }

    /* SELEKTOR */
    // Mewarisi selektor dari class Anabul
    
    /* MUTATOR */
    // Mewarisi mutator dari class Anabul

    /* IMPLEMENTASI METHOD DARI Anabul (OVERRIDING) */
    // Menampilkan gerakan spesifik Anjing
    @Override
    public void Gerak() {
        System.out.println("Anjing melata");
    }

    // Menampilkan suara spesifik Anjing
    @Override
    public void Bersuara() {
        System.out.println("Guk-guk");
    }
}