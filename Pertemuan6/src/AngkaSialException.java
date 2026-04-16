/* Nama File    : AngkaSialException.java
Deskripsi       : Eksepsi buatan sendiri, menolak masukan angka 13!
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 14 April 2026
LAB             : C1
*/

public class AngkaSialException extends Exception {
    /**
     * Membuat exception dengan pesan bawaan
     * untuk memberi tahu bahwa angka 13 tidak diperbolehkan.
     */
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
