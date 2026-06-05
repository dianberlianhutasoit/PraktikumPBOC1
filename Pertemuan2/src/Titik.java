/* Nama File    : Titik.java
Deskripsi       : Berisi atribut dan Method dalam Class Titik
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 26/02/2026
*/

public class Titik {
    /* ATRIBUT */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /* METHOD */
    //Konstruktor untuk membuat titik (0, 0)
    public Titik() {
        this (0, 0);
    }
    
    
    //Konstruktor untuk membuat objek Titik
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }


    /* SELEKTOR */
    public static int getCounterTitik() {
        return counterTitik;
    }

    //Menampilkan c ou nt er ti ti k
    public void printCounterTitik() {
        System.out.println(Titik.counterTitik);
    }

    //Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }
    
    //Mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }
    
    //Mengeset absis titik dengan nilai baru x

    /* MUTATOR */
    public void setAbsis(double x) {
        this.absis = x;
    }
    
    //Mengeset ordinaat titik dengan nilai baru y
    public void setOrdinat(double y) {
        this.ordinat = y;
    }
    //Mencetak koordinat titik
    public void printTitik() {
        System.out.println(absis + "," + ordinat);
    }

    //Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }


    //Mengembalikan nilai k ua dr an
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        }
        else if (absis < 0 && ordinat > 0) {
            return 2;
        }
        else if (absis < 0 && ordinat < 0) {
            return 3;
        }
        else if (absis > 0 && ordinat < 0) {
            return 4;
        }
        else {
            return 0;
        }
    }

    //Mengembalikan nilai j ar ak pu sa t
    public double getJarakPusat() {
        return Math.sqrt((absis*absis) + (ordinat*ordinat));
    }

    //Mengembalikan nilai j ar ak
    public double getJarak(Titik T) {
        double dx = T.absis - this.absis;
        double dy = T.ordinat - this.ordinat;
        return Math.sqrt((dx*dx) + (dy*dy));
    }

    //Menjalankan proses r ef le ks ix
    public void refleksiX() {
        this.ordinat = -(this.ordinat);
    }

    //Menjalankan proses r ef le ks iy
    public void refleksiY() {
        this.absis = -(this.absis);
    }

    //Mengembalikan nilai r ef le ks ix
    public Titik getRefleksiX() {
        return new Titik(this.absis, -(this.ordinat));
    }

    //Mengembalikan nilai r ef le ks iy
    public Titik getRefleksiY() {
        return new Titik(-(this.absis), this.ordinat);
    }

} //end class titik 