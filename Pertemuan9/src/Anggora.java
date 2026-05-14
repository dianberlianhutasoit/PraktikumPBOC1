/* Nama File    : Anggora.java
Deskripsi       : Berisi atribut dan Method dalam Class Anggora
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 5 Mei 2026
LAB             : C1
*/

public class Anggora extends Kucing {

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Anggora() {
        super();
    }

    // Konstruktor dengan parameter
    public Anggora(String Nama, double bobot) {
        super(Nama, bobot);
    }

    /* IMPLEMENTASI METHOD DARI Kucing (OVERRIDING) */
    // Menampilkan suara spesifik Anggora
    @Override
    public void Bersuara() {
        System.out.println("Meong (Khas Anggora)");
    }
}