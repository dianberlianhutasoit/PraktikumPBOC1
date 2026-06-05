/* Nama File    : Garis.java
Deskripsi       : Berisi atribut dan Method dalam Class Garis
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 03/03/2026
*/

public class Garis {
    /* ATRIBUT */
    private Titik TitikAwal;
    private Titik TitikAkhir;
    private static int counterGaris = 0;

    /* METHOD */

    /* KONSTRUKTOR */
    //Konstruktor untuk membuat garis dengan titik awal (0,0) dan titik akhir (1,1)
    public Garis() {
        this.TitikAwal = new Titik(0 , 0);
        this.TitikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    //Konstruktor untuk membuat garis dengan titik awal dan titik akhir tertentu
    public Garis(Titik TitikAwal, Titik TitikAkhir) {
        this.TitikAwal = TitikAwal;
        this.TitikAkhir = TitikAkhir;
        counterGaris++;
    }

    /* SELEKTOR */
    //Mengembalikan titik awal garis
    public Titik getTitikAwal() {
        return TitikAwal;
    }

    //Mengembalikan titik akhir garis
    public Titik getTitikAkhir() {
        return TitikAkhir;
    }

    //Mengembalikan jumlah objek garis yang telah dibuat
    public static int getCounterGaris() {
        return counterGaris;
    }

    //Mengembalikan panjang garis
    public double getPanjang() {
        return TitikAwal.getJarak(TitikAkhir);
    }

    //Mengembalikan gradien garis
    public double getGradien() {
        double dx = (TitikAkhir.getAbsis() - TitikAwal.getAbsis());
        double dy = (TitikAkhir.getOrdinat() - TitikAwal.getOrdinat());
        
        return dy / dx;
    }

    //Mengembalikan titik tengah garis
    public Titik getTitikTengah() {
        double TengahX = (TitikAwal.getAbsis() + TitikAkhir.getAbsis()) / 2;
        double TengahY = (TitikAwal.getOrdinat() + TitikAkhir.getOrdinat()) / 2;

        return new Titik(TengahX, TengahY);
    }

    //Mengembalikan true jika garis sejajar dengan garis G
    public boolean isSejajar(Garis G) {
        if (this.getGradien() == G.getGradien()) {
            return true;
        }
        else {
            return false;
        }
    } 

    //Mengembalikan true jika garis tegak lurus dengan garis G
    public boolean isTegakLurus(Garis G) {
        if (this.getGradien() * G.getGradien() == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    /* MUTATOR */
    //Mengeset titik awal garis dengan titik baru
    public void setTitikAwal(Titik TitikAWal) {
        this.TitikAwal = TitikAWal;
    }

    //Mengeset titik akhir garis dengan titik baru
    public void setTitikAkhir(Titik TitikAkhir) {
        this.TitikAkhir = TitikAkhir;
    }

    //Mencetak titik awal dan titik akhir garis
    public void printGaris() {
        System.out.println("(" + this.TitikAwal.getAbsis() + "," + this.TitikAwal.getOrdinat() +")" + " (" + this.TitikAkhir.getAbsis() + "," + this.TitikAkhir.getOrdinat() + ")");
    }
}
