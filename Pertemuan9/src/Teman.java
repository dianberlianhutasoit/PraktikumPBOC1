/* Nama File    : Teman.java
Deskripsi       : Berisi atribut dan Method dalam Class Teman
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 7 Mei 2026
LAB             : C1
*/

import java.util.ArrayList;
import java.util.List;

public class Teman {
    /* --- ATRIBUT --- */
    private  int nbelm;
    private List<String> Lnama;

    /* --- METHOD --- */
    
    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Teman() {
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }

    /* SELEKTOR */

    // Mengembalikan banyaknya elemen
    public int getNbElm() {
        return this.nbelm;
    }

    // Mengembalikan nama berdasarkan indeks dengan Exception
    public String getNama(int indeks) throws IndexOutOfBoundsException {
        if (indeks < 0 || indeks >= this.nbelm) {
            throw new IndexOutOfBoundsException("Indeks diluar batas");
        }
        return this.Lnama.get(indeks);
    }

    /* MUTATOR */
    // Mengubah atau mengeset nama pada indeks tertentu dengan Exception
    public void setNama(int indeks, String Nama) throws IndexOutOfBoundsException {
        if (indeks < 0 || indeks >= this.nbelm) {
            throw new IndexOutOfBoundsException("Indeks diluar batas");
        }
        this.Lnama.set(indeks, Nama);
    }

    // Menambah nama baru kedalam List
    public void addNama(String Nama) {
        this.Lnama.add(Nama);
        this.nbelm = this.Lnama.size();
    }

    // Menghapus nama dari dalam list
    public void delNama(String Nama) {
        boolean isRemoved = this.Lnama.remove(Nama);   // Mengembalikan true jika nama bisa dihapus dari List
        if (isRemoved) {
            this.nbelm = this.Lnama.size();   // Jika nama bisa dihapus maka nbelm di update dengan ukuran List saat ini
        }
        else {
            System.out.println("Nama tidak ditemukan");  // Jika tidak dapat dihapus
        }
    }

    // Mengecek apakah suatu nama ada di dalam List
    public boolean isMember(String Nama) {
        return this.Lnama.contains(Nama);
    }

    // Mengganti nama lama dengan nama baru menggunakan Exception
    public void gantiNama(String NamaLama, String NamaBaru) throws IllegalArgumentException {
        int indeks = this.Lnama.indexOf(NamaLama);
        if (indeks >= 0) {
            this.Lnama.set(indeks, NamaBaru);  // Jika indeks sesuai dengan batasan (ditemukan), perbarui nama
        }
        else {
            throw new IllegalArgumentException("Nama Lama tidak ditemukan");  // Jika nama lama tidak ditemukan
        }
    }

    // Menghitung ada berapa banyak nama yang sama
    public int countNama(String Nama) {
        int jumlah = 0;

        for(String n : this.Lnama) {
            if (n.equals(Nama)) {  // Jika nama sama maka jumlah akan bertambah
                jumlah++;
            }
        }
        return jumlah;
    }

    // Menampilkan semua nama teman yang ada dalam LNama
    public void showTeman() {
        System.out.print("Daftar Nama teman : " );
        if (this.nbelm == 0) {
            System.out.println("Daftar Nama Kosong"); 
        }
        else {
            for (int i = 0; i < this.nbelm; i++) {
                System.out.print(" " + this.Lnama.get(i));
            }
        }
    }
}
