/* Nama File    : Titik.java
Deskripsi       : Berisi atribut dan Method dalam Class Titik
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 19/02/2026
*/

public class Titik {
    /* ATRIBUT */
    double absis;
    double ordinat;

    /* METHOD */
    //Konstruktor untuk membuat titik (0, 0)
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    //Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
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

} //end class titik 