/* Nama File    : MGaris.java
Deskripsi       : Berisi atribut dan Method dalam Class Titik
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 03/03/2026
*/

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        Titik T1 = new Titik(2, 4);
        Titik T2 = new Titik(6,10);
        Garis G2 = new Garis(T1, T2);

        System.out.print("Titik Awal dari Garis G2 adalah : ");
        G2.getTitikAwal().printTitik();
        System.out.print("Titik Akhir dari Garis G2 adalah : ");
        G2.getTitikAkhir().printTitik();

        G1.setTitikAwal(new Titik(2, 2));
        System.out.print("Titik Awal dari Garis G1 adalah : ");
        G1.getTitikAwal().printTitik();

        G1.setTitikAkhir(new Titik(8,8));
        System.out.print("Titik Akhir dari Garis G1 adalah : ");
        G1.getTitikAkhir().printTitik();

        System.out.println("Jumlah Objek Garis = " + Garis.getCounterGaris());
        System.out.println("Panjang dari Garis G1 adalah : " + G1.getPanjang());
        System.out.println("Gradien dari garis G1 adalah : " + G1.getGradien());

        System.out.print("Titik tengah dari garis G1 adalah : ");
        G1.getTitikTengah().printTitik();

        System.out.println("Apakah Garis G1 dan G2 sejajar? " + G1.isSejajar(G2));
        System.out.println("Apakah Garis G1 dan G2 tegak lurus? " + G1.isTegakLurus(G2));

        G1.printGaris();
        G2.printGaris();



       
    }
    
}
