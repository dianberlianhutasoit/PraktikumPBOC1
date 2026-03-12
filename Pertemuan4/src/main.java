/* Nama File    : main.java
Deskripsi       : Berisi driver class Bangun Datar, Lingkaran, dan Persegi 
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 12 Maret 2026
LAB             : C1
*/

public class main {
    public static void main(String[] args) {
        Persegi P1 = new Persegi();
        P1.printInfo();
        System.out.println();

        Persegi P2 = new Persegi(5, "Putih", "Pink");
        P2.printInfo();
        System.out.println();
        
        System.out.println("Panjang sisi dari P2 adalah " + P2.getSisi());
        System.out.println("Luas dari P2 adalah " + P2.getLuas());
        System.out.println("Keliling persegi P2 adalah " + P2.getKeliling());
        System.out.println("Panjang Diagonal dari P2 adalah " + P2.getDiagonal());
        System.out.println();

        P1.setSisi(4);

        P1.setWarna("merah");
        P1.setBorder("Coklat");
        System.out.println("Warna dari Persegi P1 adalah " + P1.getWarna());
        System.err.println("Border dari Persegi P1 adalah " + P1.getBorder());
        System.out.println();

        P1.printInfo();
        System.out.println();

        /* *************************************** */

        BangunDatar L1 = new Lingkaran();
        ((Lingkaran)(L1)).printInfo();
        System.out.println();

        BangunDatar L2 = new Lingkaran(21, "biru", "kuning");
        ((Lingkaran)(L2)).printInfo();


        System.out.println("Jari-jari Lingkaran L1 adalah " + ((Lingkaran)(L2)).getJari());
        System.out.println("Luas Lingkaran L1 adalah " + ((Lingkaran)(L2)).getLuas());
        System.out.println("Keliling Lingkaran L1 adalah " + ((Lingkaran)(L2)).getKeliling());
        System.out.println();

        ((Lingkaran)(L1)).setJari(7);
        ((Lingkaran)(L1)).setJmlSisi(1);
        ((Lingkaran)(L1)).setWarna("putih");
        ((Lingkaran)(L1)).setBorder("hitam");
        ((Lingkaran)(L1)).printInfo();

        BangunDatar.printCounterBangunDatar();


    }
}