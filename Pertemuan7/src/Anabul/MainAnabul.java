package Anabul;

/* Nama File    : MainAnabul.java
Deskripsi       : Berisi main program untuk menguji Polimorfisme Universal Inclusion
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 28 April 2026
LAB             : C1
*/

public class MainAnabul {
    public static void main(String[] args) {
        
        System.out.println("--- UJI COBA POLIMORFISME INCLUSION ---");

        // a. Membuat objek menggunakan konstruktor dengan parameter
        Anabul peliharaan1 = new Kucing("Yiyi");
        
        // b. Membuat objek lalu mengisi nama menggunakan Mutator (Setter)
        Anabul peliharaan2 = new Anjing();
        peliharaan2.setNama("Bibing");
        
        // c. Membuat objek menggunakan konstruktor dengan parameter
        Anabul peliharaan3 = new Burung("Yoyo");

        // Menampilkan data menggunakan Selektor (Getter)
        System.out.println("Peliharaan 1 : " + peliharaan1.getNama());
        peliharaan1.Gerak();
        peliharaan1.Bersuara();
        System.out.println();

        System.out.println("Peliharaan 2 : " + peliharaan2.getNama());
        peliharaan2.Gerak();
        peliharaan2.Bersuara();
        System.out.println();

        System.out.println("Peliharaan 3 : " + peliharaan3.getNama());
        peliharaan3.Gerak();
        peliharaan3.Bersuara();
    }
}