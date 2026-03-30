/* Nama File    : mainBangunDatar2.java
Deskripsi       : Driver untuk menguji abstract class dan interface (resize)
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 30 Maret 2026
LAB             : C1
*/

public class mainBangunDatar {
    public static void main(String[] args) {

        /* *************** PERSEGI *************** */
        Persegi P1 = new Persegi();
        P1.printInfo();
        System.out.println();

        Persegi P2 = new Persegi(5, "Putih", "Pink");
        P2.printInfo();
        System.out.println();

        System.out.println("Panjang sisi dari P2 adalah " + P2.getSisi());
        System.out.println("Luas dari P2 adalah " + P2.getLuas());
        System.out.println("Keliling persegi P2 adalah " + P2.getKeliling());
        System.out.println();

        // Resize Persegi
        P2.zoomIn();
        System.out.println("Setelah zoomIn (Persegi P2): ");
        P2.printInfo();
        System.out.println();

        P2.zoomOut();
        System.out.println("Setelah zoomOut (Persegi P2): ");
        P2.printInfo();
        System.out.println();

        P2.zoom(200);
        System.out.println("Setelah zoom 200% (Persegi P2): ");
        P2.printInfo();
        System.out.println();

        /* *************** LINGKARAN *************** */
        BangunDatar L1 = new Lingkaran();
        ((Lingkaran) L1).printInfo();
        System.out.println();

        BangunDatar L2 = new Lingkaran(7, "Biru", "Hitam");
        ((Lingkaran) L2).printInfo();
        System.out.println();

        System.out.println("Jari-jari Lingkaran L2 adalah " + ((Lingkaran) L2).getJari());
        System.out.println("Luas Lingkaran L2 adalah " + ((Lingkaran) L2).getLuas());
        System.out.println("Keliling Lingkaran L2 adalah " + ((Lingkaran) L2).getKeliling());
        System.out.println();

        // Resize Lingkaran
        ((Lingkaran) L2).zoomIn();
        System.out.println("Setelah zoomIn (Lingkaran L2): ");
        ((Lingkaran) L2).printInfo();
        System.out.println();

        ((Lingkaran) L2).zoomOut();
        System.out.println("Setelah zoomOut (Lingkaran L2): ");
        ((Lingkaran) L2).printInfo();
        System.out.println();

        ((Lingkaran) L2).zoom(50);
        System.out.println("Setelah zoom 50% (Lingkaran L2): ");
        ((Lingkaran) L2).printInfo();
        System.out.println();

        /* *************** POLYMORPHISM *************** */
        BangunDatar B1 = new Persegi(10, "Merah", "Hitam");
        BangunDatar B2 = new Lingkaran(10, "Hijau", "Putih");

        System.out.println("Info B1:");
        B1.printInfo();
        System.out.println();

        System.out.println("Info B2:");
        B2.printInfo();
        System.out.println();

        /* *************** PERBANDINGAN *************** */
        System.out.println("Apakah luas B1 dan B2 sama? " + B1.isEqualLuas(B2));
        System.out.println("Apakah keliling B1 dan B2 sama? " + B1.isEqualKeliling(B2));
        System.out.println();

        /* *************** COUNTER *************** */
        BangunDatar.printCounterBangunDatar();
    }
}