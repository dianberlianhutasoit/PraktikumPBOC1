/* Nama File    : Teman.java
Deskripsi       : Berisi atribut dan Method dalam Class Piaraan
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 7 Mei 2026
LAB             : C1
*/

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    /* --- ATRIBUT --- */
    private int nbelm;
    private Queue<Anabul> Lanabul;   // Koleksi antrian dengan elemen objek Anabul

    
    /* --- METHOD --- */

    /* KONSTRUKTOR */
    public Piaraan() {
        this.nbelm = 0;
        this.Lanabul = new LinkedList<>();  // Queue di instantiasi dengan LinkedList
    }

    /* SELEKTOR */

    // Mengembalikan banyaknya elemen
    public int getNbelm() {
        return this.nbelm;
    }

    // Mengembalikan data anabul pertama dalam antrian
    public Anabul getAnabul() {
        return this.Lanabul.peek();   // Mengintip antrian paling depan (peek)
    }

    /* MUTATOR */

    // Menambah elemen anabul ke dalam antrian -> anabul yang ditambahkan jadi elemen akhir
    public void enqueueAnabul(Anabul anabul) {
        this.Lanabul.add(anabul);
        this.nbelm = this.Lanabul.size();
    }

    // Mengambil dan mengeluarkan anabul dari dalam antrian
    public Anabul dequeueAnabul() {
        Anabul anabul = this.Lanabul.poll(); // Menghapus dan mengembalikan elemen pertama (poll)
        if (anabul != null) {
            this.nbelm = this.Lanabul.size();
        }
        else {
            System.out.println("Antrian Kosong");  
        }
        return anabul;
    }

    /* METHOD LAINNYA */

    // Mengecek apakah anabul ada di dalam antrian
    public boolean isMember(Anabul anabul) {
        return this.Lanabul.contains(anabul);
    }

    // Menampilkan nama=nama panggilan Anabul yang ada dalam antrian
    public void showAnabul() {
        if (this.Lanabul.isEmpty()) {
            System.out.println("Antrian Kosong");
        }
        else{
            for (Anabul anabul : this.Lanabul) {
                System.out.println(" " + anabul.getNama());
            }
        }
    }

    // Menghitung banyak keluarga kucing dalam antrian
    public int countKucing() {
        int jumlah = 0;
        for(Anabul anabul : this.Lanabul) {
            if (anabul instanceof Kucing) {
                jumlah++;                
            }
        }
        return jumlah;
    }

    // Bobot Kucing
    public double bobotKucing() {
        double totalBobot = 0.0;
        for (Anabul a : this.Lanabul) {
            if (a instanceof Kucing) {
                Kucing k = (Kucing) a;
                totalBobot += k.getBobot();
            }
        }
        return totalBobot;
    }

    // ShowJenisAnabul
    public void ShowJenisAnabul() {
        if (this.Lanabul.isEmpty()) {
            System.out.println("Antrean Kosong");
        }
        else{
            for(Anabul a : this.Lanabul) {
                System.out.println(a.getNama() + " Jenis : " + a.getClass().getName());
            }
        }
    }

}
