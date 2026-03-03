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

        // Titik T1 = new Titik();
        // Titik T2 = new Titik(3, 5);

        // System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        // System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());

        /* ********************** */
        Titik T1 = new Titik();
        Titik T2 = new Titik(2, 2);
        
        System.out.println("Nilai Absis T1 adalah : " + T1.getAbsis());
        System.out.println("Nilai Ordinat T1 adalah : " + T1.getOrdinat());
        T1.setAbsis(3);
        T1.setOrdinat(5);
        System.out.print("Titik T1 saat ini adalah : "); T1.printTitik();
        System.out.println("Nilai Absis T1 setelah di set : " + T1.getAbsis());
        System.out.println("Nilai Ordinat T1 setelah di set : " + T1.getOrdinat());
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        T1.printCounterTitik();
        T1.geser((2), 1);
        System.out.print("Titik T1 setelah di geser adalah : "); T1.printTitik();
        System.out.println("Titik T1 saat ini berada di kuadran : " + T1.getKuadran());

        System.out.println("Jarak titik T1 saat ini dengan Pusat adalah : " + T1.getJarakPusat());

        System.out.println("Jarak titik T2 terhadap titik T1 adalah : " + T2.getJarak(T1));
        T2.refleksiX();
        T2.refleksiY();
        System.out.print("Refleksi titik T2 terhadap Sumbu X adalah : ");
        Titik T3 = T2.getRefleksiX();
        T3.printTitik();
        System.out.print("Refleksi titik T2 terhadap Sumbu Y adalah : ");
        Titik T4 = T2.getRefleksiY();
        T4.printTitik();

        





    }
}