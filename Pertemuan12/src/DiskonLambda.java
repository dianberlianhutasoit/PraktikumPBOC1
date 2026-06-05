/* Nama File    : DiskonLambda.java
Deskripsi       : Ekspresi lambda dasar, digunakan untuk menghitung diskon.
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 5 Mei 2026
LAB             : C1
*/

interface IDiskon {
    /* METHOD */

    /* SELEKTOR */
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    //Method utama untuk menjalankan program
    public static void main(String[] args) {
        // Tanpa lambda

        IDiskon diskonMerdeka = new IDiskon() {
            //Menghitung d is ko n
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // Dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // Dengan lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}