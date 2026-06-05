/* Nama File    : LambdaList.java
Deskripsi       : Implementasi lambda pada List, digunakan sebagai parameter pada method.
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 7 Mei 2026
LAB             : C1
*/

import java.util.ArrayList;

public class LambdaList {
    /* METHOD */
    //Method utama untuk menjalankan program
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // Lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}