/* Nama File    : Datum.java
Deskripsi       : Berisi kelas generik Datum untuk menyimpan satu nilai tipe apapun
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 7 Mei 2026
LAB             : C1
*/

public class Datum<T> {
    /* --- ATRIBUT --- */ 
    private T isi;

    /* --- METHOD --- */

    /* SELEKTOR */
    // Mengembalikan nilai isi Datum
    public T getIsi() {
        return this.isi;
    }
    
    /* MUTATOR */
    // Mengubah isi Datum menjadi isibaru
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
}