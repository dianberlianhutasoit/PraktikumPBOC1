/* Nama File    : Asersi1.java
Deskripsi       : Program untuk menunjukkan asersi
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 14 April 2026
LAB             : C1
*/

public class Asersi1 {
    /**
     * Menunjukkan penggunaan assert untuk memeriksa
     * asumsi bahwa nilai x seharusnya negatif pada blok else.
     */
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } 
        
        else {
            assert(x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
