/* Nama File    : MTitik.java
Deskripsi       : Berisi atribut dan Method dalam Class Titik
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 19/02/2026
*/

public class MTitik {
    /* METHOD */
    //Method utama untuk menjalankan program
    public static void main(String[] args) {
        //Membuat objek titik T1 dengan koordinat awal (0,0)

        Titik T1 = new Titik();

        //Mengeset nilai absis dan ordinat T1
        T1.setAbsis(3);
        T1.setOrdinat(4);

        //Mencetak koordinat T1 setelah diset
        T1.printTitik();

        //Menggeser T1 sejauh 3 pada absis dan 4 pada ordinat
        T1.geser(3, 4);

        //Mencetak koordinat T1 setelah digeser
        T1.printTitik();

    }
}
