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
    
    
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

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

    public double getJarakPusat() {
        return Math.sqrt((absis*absis) + (ordinat*ordinat));
    }

    public double getJarak(Titik T) {
        double dx = T.absis - this.absis;
        double dy = T.ordinat - this.ordinat;
        return Math.sqrt((dx*dx) + (dy*dy));
    }

    public void refleksiX() {
        this.ordinat = -(this.ordinat);
    }

    public void refleksiY() {
        this.absis = -(this.absis);
    }

    public Titik getRefleksiX() {
        return new Titik(this.absis, -(this.ordinat));
    }

    public Titik getRefleksiY() {
        return new Titik(-(this.absis), this.ordinat);
    }

} //end class titik 