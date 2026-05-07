/* Nama File    : Data.java
Deskripsi       : Berisi implementasi class generik Data untuk menyimpan banyak data
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 5 Mei 2026
LAB             : C1
*/

public class Data<T> {
    /* --- ATRIBUT --- */
    private static final int Kapasitas = 100;
    private T[] ruang;
    private int banyak;

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor untuk menginisialisasi ruang data dan jumlah data.
    @SuppressWarnings("unchecked")
    public Data() {
        this.ruang = (T[]) new Object[Kapasitas];
        this.banyak = 0;
    }

    /* SELEKTOR */
    // Mengembalikan isi data pada posisi tertentu.
    @SuppressWarnings("unchecked")
    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= Kapasitas && posisi <= this.banyak) {
            return (T) this.ruang[posisi - 1];
        }
        return null;
    }

    // Mengembalikan banyak data yang sudah terisi.
    public int getSize() {
        return this.banyak;
    }

    // Mengembalikan kapasitas maksimum data.
    public int getKapasitas() {
        return Kapasitas;
    }

    /* MUTATOR */
    // Mengisi data pada posisi tertentu.
    public void setIsi(int posisi, T isi) {
        if (posisi >= 1 && posisi <= Kapasitas) {
            this.ruang[posisi - 1] = isi;
            if (posisi > this.banyak) {
                this.banyak = posisi;
            }
        }
    }
}