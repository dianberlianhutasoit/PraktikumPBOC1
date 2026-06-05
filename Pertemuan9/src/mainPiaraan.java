/* Nama File    : mainPiaraan.java
Deskripsi       : Driver program untuk menguji kelas Piaran
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 7 Mei 2026
LAB             : C1
*/

public class mainPiaraan {
    /* METHOD */
    //Method utama untuk menjalankan program
    public static void main(String[] args) {
        // Inisialisasi Koleksi antrian Piaran 
        Piaraan K = new Piaraan();

        // Persiapan data objek
        Kucing k1 = new Kucing("Bibing", 4.5);
        Kucing k2 = new Kucing("Mici", 3.2);
        Anjing aj1 = new Anjing();
        Burung b1 = new Burung();
        Anggora ag1 = new Anggora("puff", 3.8);
        Kembangtelon kt1 = new Kembangtelon("Milo", 2.8);

        aj1.setNama("Mopi");
        b1.setNama("Cimit");

        // Uji enqueueAnabul
        K.enqueueAnabul(k1);
        K.enqueueAnabul(k2);
        K.enqueueAnabul(aj1);
        K.enqueueAnabul(b1);
        K.enqueueAnabul(ag1);
        K.enqueueAnabul(kt1);

        System.out.println("********************************************************");

        // Uji getNbelm
        System.out.println("Jumlah Elemen : " + K.getNbelm());

        // Uji getAnabul
        if (K.getAnabul() != null) {
            System.out.println("Anabul terdepan : " + K.getAnabul().getNama());
        }

        System.out.println("********************************************************");

        // Uji dequeueAnabul dan showAnabul
        K.dequeueAnabul();
        K.showAnabul();

        System.out.println("\n********************************************************");

        // Uji isMember
        System.out.println("Apakah Mici ada dalam Queue ? " + K.isMember(k2));
        System.out.println("Apakah Bibing ada dalam Queue ? " + K.isMember(k1)); // Sudah di-dequeue

        // Uji countKucing
        System.out.println("Kucing dalam Queue ditemukan sebanyak : " + K.countKucing());

        K.showAnabul();

        System.out.println("\n********************************************************");

        // Uji bobotKucing
        System.out.println("Total bobot Kucing dalam Queue : " + K.bobotKucing());

        // Uji ShowJenisAnabul
        K.ShowJenisAnabul();

        System.out.println("\n********************************************************");
    }
}