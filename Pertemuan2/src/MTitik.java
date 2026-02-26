/* Nama File    : MTitik.java
Deskripsi       : Berisi atribut dan Method dalam Class Titik
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 26/02/2026
*/

public class MTitik {
    public static void main(String[] args) {
        // Titik T1 = new Titik();
        // T1.setAbsis(3);
        // T1.setOrdinat(4);
        // T1.printTitik();
        // T1.geser(3, 4);
        // T1.printTitik();

        // Titik T2 = T1;
        // T2.printTitik();
        // T1.setAbsis(10);
        // T1.setOrdinat(10);
        // T2.printTitik();

        // Pertemuan 2

        Titik T1 = new Titik();
        Titik T2 = new Titik(3, 5);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());
        
    }
}