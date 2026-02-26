/* Nama File    : Titik.java
Deskripsi       : Berisi atribut dan Method dalam Class Titik
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 19/02/2026
*/

public class Titik {
    /* ATRIBUT */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* METHOD */
    //Konstruktor untuk membuat titik (0, 0)
    Titik() {
        this(0,0);
    }

    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    void printCounterTitik() {
        System.out.println(Titik.counterTitik);
    }

    //Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    //Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    static int getCounterTitik() {
        return counterTitik;
    }

    //Mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        this.absis = x;
    }

    //Mengeset ordinaat titik dengan nilai baru y
    void setOrdinat(double y) {
        this.ordinat = y;
    }

    //Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    int getKuadran() {
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