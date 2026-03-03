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

    // Konstruktor untuk membuat garis
    public Garis() {
        this.TitikAwal = new Titik(0 , 0);
        this.TitikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    public Garis(Titik TitikAwal, Titik TitikAkhir) {
        this.TitikAwal = TitikAwal;
        this.TitikAkhir = TitikAkhir;
        counterGaris++;
    }

    // Selektor
    public Titik getTitikAwal() {
        return TitikAwal;
    }

    public Titik getTitikAkhir() {
        return TitikAkhir;
    }

    public void setTitikAwal(Titik TitikAWal) {
        this.TitikAwal = TitikAWal;
    }

    public void setTitikAkhir(Titik TitikAkhir) {
        this.TitikAkhir = TitikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    public double getPanjang() {
        return TitikAwal.getJarak(TitikAkhir);
    }

    public double getGradien() {
        double dx = (TitikAkhir.getAbsis() - TitikAwal.getAbsis());
        double dy = (TitikAkhir.getOrdinat() - TitikAwal.getOrdinat());
        
        return dy / dx;
    }

    public Titik getTitikTengah() {
        double TengahX = (TitikAwal.getAbsis() + TitikAkhir.getAbsis()) / 2;
        double TengahY = (TitikAwal.getOrdinat() + TitikAkhir.getOrdinat()) / 2;

        return new Titik(TengahX, TengahY);
    }

    public boolean isSejajar(Garis G) {
        if (this.getGradien() == G.getGradien()) {
            return true;
        }
        else {
            return false;
        }
    } 

    public boolean isTegakLurus(Garis G) {
        if (this.getGradien() * G.getGradien() == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void printGaris() {
        System.out.println("(" + this.TitikAwal.getAbsis() + "," + this.TitikAwal.getOrdinat() +")" + " (" + this.TitikAkhir.getAbsis() + "," + this.TitikAkhir.getOrdinat() + ")");
    }




    

    


}
