/* Nama File : LatihanMapLambda.java
  Deskripsi : Menampilkan key dan value dari Map menggunakan ekspresi lambda.
  Pembuat   : Dian Berlian Hutasoit
  Tanggal   : 5 Juni 2026
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class LatihanMapLambda {
    /* METHOD */
    //Method utama untuk menjalankan program
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new LinkedHashMap<>();
        mahasiswaMap.put("24060124130096", "Arya");
        mahasiswaMap.put("24060124130097", "Adi");
        mahasiswaMap.put("24060124130098", "Bambang");
        mahasiswaMap.put("24060124130099", "Cici");

        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM  : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println();
        });
    }
}