/* Nama File    : Kembangtelon.java
Deskripsi       : Berisi atribut dan Method dalam Class Kembangtelon
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 7 Mei 2026
LAB             : C1
*/

public class Kembangtelon extends Kucing {

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Kembangtelon() {
        super();
    }

    // Konstruktor dengan parameter
    public Kembangtelon(String Nama, double bobot) {
        super(Nama, bobot);
    }

    /* IMPLEMENTASI METHOD DARI Kucing (OVERRIDING) */
    // Menampilkan suara spesifik Kembangtelon
    @Override
    public void Bersuara() {
        System.out.println("Meong (Khas Kembangtelon)");
    }
}