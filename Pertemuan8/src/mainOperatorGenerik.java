/* Nama File    : mainOperatorGenerik.java
Deskripsi       : Driver program untuk menguji prosedur Tukar dan fungsi Bobot2
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 5 Mei 2026
LAB             : C1
*/

public class mainOperatorGenerik {

    /* --- METHOD --- */

    /* METHOD MAIN */
    public static void main(String[] args) {
        // Membuat objek operator karena menggunakan method non-static (biasa)
        OperatorGenerik operator = new OperatorGenerik();

        /* UJI PROSEDUR TUKAR (TIPE DASAR) */

        // 1. Tukar Integer
        System.out.println(" --- Tukar Integer --- ");
        Datum<Integer> angka1 = new Datum<>(); angka1.setIsi(3);
        Datum<Integer> angka2 = new Datum<>(); angka2.setIsi(6);
        System.out.println("Sebelum : a = " + angka1.getIsi() + ", b = " + angka2.getIsi());
        operator.Tukar(angka1, angka2);
        System.out.println("Setelah : a = " + angka1.getIsi() + ", b = " + angka2.getIsi());
        System.out.println();

        // 2. Tukar String
        System.out.println(" --- Tukar String --- ");
        Datum<String> teks1 = new Datum<>(); teks1.setIsi("Kucing");
        Datum<String> teks2 = new Datum<>(); teks2.setIsi("Anjing");
        System.out.println("Sebelum : a = " + teks1.getIsi() + ", b = " + teks2.getIsi());
        operator.Tukar(teks1, teks2);
        System.out.println("Setelah : a = " + teks1.getIsi() + ", b = " + teks2.getIsi());
        System.out.println();

        // 3. Tukar Double
        System.out.println(" ---Tukar Double --- ");
        Datum<Double> dbl1 = new Datum<>(); dbl1.setIsi(0.2);
        Datum<Double> dbl2 = new Datum<>(); dbl2.setIsi(2.007);
        System.out.println("Sebelum : a = " + dbl1.getIsi() + ", b = " + dbl2.getIsi());
        operator.Tukar(dbl1, dbl2);
        System.out.println("Setelah : a = " + dbl1.getIsi() + ", b = " + dbl2.getIsi());
        System.out.println();


        /* UJI PROSEDUR TUKAR (ANABUL) */

        // 1. Tukar Anjing
        System.out.println(" --- Tukar Anjing --- ");
        Datum<Anjing> dA1 = new Datum<>(); dA1.setIsi(new Anjing("mopi"));
        Datum<Anjing> dA2 = new Datum<>(); dA2.setIsi(new Anjing("Bobi"));
        System.out.println("Sebelum : a = " + dA1.getIsi().getNama() + ", b = " + dA2.getIsi().getNama());
        operator.Tukar(dA1, dA2);
        System.out.println("Setelah : a = " + dA1.getIsi().getNama() + ", b = " + dA2.getIsi().getNama());
        System.out.println();

        // 2. Tukar Kucing
        System.out.println(" --- Tukar Kucing --- ");
        Datum<Kucing> dK1 = new Datum<>(); dK1.setIsi(new Kucing("bibing", 4.5));
        Datum<Kucing> dK2 = new Datum<>(); dK2.setIsi(new Kucing("Ragdoll", 4.0));
        System.out.println("Sebelum : a = " + dK1.getIsi().getNama() + " (" + dK1.getIsi().getBobot() + " kg)");
        System.out.println("          b = " + dK2.getIsi().getNama() + " (" + dK2.getIsi().getBobot() + " kg)");
        operator.Tukar(dK1, dK2);
        System.out.println("Setelah : a = " + dK1.getIsi().getNama() + " (" + dK1.getIsi().getBobot() + " kg)");
        System.out.println("          b = " + dK2.getIsi().getNama() + " (" + dK2.getIsi().getBobot() + " kg)");
        System.out.println();

        // 3. Tukar Burung
        System.out.println(" --- Tukar Burung --- ");
        Datum<Burung> dB1 = new Datum<>(); dB1.setIsi(new Burung("cicit"));
        Datum<Burung> dB2 = new Datum<>(); dB2.setIsi(new Burung("Pipit"));
        System.out.println("Sebelum : a = " + dB1.getIsi().getNama() + ", b = " + dB2.getIsi().getNama());
        operator.Tukar(dB1, dB2);
        System.out.println("Setelah : a = " + dB1.getIsi().getNama() + ", b = " + dB2.getIsi().getNama());
        System.out.println();


        /* UJI FUNGSI BOBOT2 (KUCING) */

        // A. Bobot 2 Kucing Biasa
        System.out.println(" --- Bobot 2 Kucing Biasa --- ");
        Kucing kc1 = new Kucing("Mici", 12.5);
        Kucing kc2 = new Kucing("Cumi", 3.2);
        System.out.println("Kucing 1    : " + kc1.getNama() + " (" + kc1.getBobot() + " kg)");
        System.out.println("Kucing 2    : " + kc2.getNama() + " (" + kc2.getBobot() + " kg)");
        // Panggilan diubah menjadi static access lewat nama Kelas
        System.out.println("Total Bobot : " + OperatorGenerik.Bobot2(kc1, kc2) + " kg\n");

        // B. Bobot 2 Anggora
        System.out.println(" --- Bobot 2 Anggora --- ");
        Anggora ag1 = new Anggora("Anggora Putih", 3.0);
        Anggora ag2 = new Anggora("Anggora Pink", 3.8);
        System.out.println("Anggora 1   : " + ag1.getNama() + " (" + ag1.getBobot() + " kg)");
        System.out.println("Anggora 2   : " + ag2.getNama() + " (" + ag2.getBobot() + " kg)");
        System.out.println("Total Bobot : " + OperatorGenerik.Bobot2(ag1, ag2) + " kg\n");

        // C. Bobot 2 Kembangtelon
        System.out.println(" ---Bobot 2 Kembangtelon --- ");
        Kembangtelon kt1 = new Kembangtelon("Belang Tiga", 2.8);
        Kembangtelon kt2 = new Kembangtelon("Calico", 3.2);
        System.out.println("Kembangtelon 1 : " + kt1.getNama() + " (" + kt1.getBobot() + " kg)");
        System.out.println("Kembangtelon 2 : " + kt2.getNama() + " (" + kt2.getBobot() + " kg)");
        System.out.println("Total Bobot    : " + OperatorGenerik.Bobot2(kt1, kt2) + " kg\n");

        // D. Bobot 2 Mix (Anggora + Kembangtelon)
        System.out.println(" --- Bobot 2 Mix --- ");
        System.out.println("Anggora      : " + ag1.getNama() + " (" + ag1.getBobot() + " kg)");
        System.out.println("Kembangtelon : " + kt1.getNama() + " (" + kt1.getBobot() + " kg)");
        System.out.println("Total Bobot  : " + OperatorGenerik.Bobot2(ag1, kt1) + " kg");
    }
}