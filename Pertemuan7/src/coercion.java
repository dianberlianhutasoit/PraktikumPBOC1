/* Nama File    : Coercion.java
Deskripsi       : Berisi penerapan Polimorfisme Ad Hoc Coercion
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 28 April 2026
LAB             : C1
*/

public class coercion {
    public static void main(String[] args) {
        
        // a. Menampilkan nilai integer 65 kedalam beberapa bentuk (Polimorfisme)
        int nilaiInt = 65;
        System.out.println("Sebagai integer : " + nilaiInt);       
        System.out.println("Sebagai karakter: " + (char) nilaiInt); 
        System.out.println("Sebagai real    : " + (double) nilaiInt); 

        // b. Mengubah nilai Integer ke Real lalu kembali ke Integer
        double nilaiReal = (double)nilaiInt;
        int nilaiKembali = (int) nilaiReal; 
        System.out.println("Nilai Double : " + nilaiReal);
        System.out.println("Kembali ke int : " + nilaiKembali);

        // c. Konkatenasi 2 String dan Menjumlahkan nilainya sebagai integer
        String X = "1234";
        String Y = "5678";
        String S = X + Y;  
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);   // Menggunakan Integer.parseInt()
        System.out.println("Hasil konkatenasi S    : " + S);
        System.out.println("Hasil penjumlahan Z    : " + Z);

        // d. Konkatenasi 2 String dan Menjumnlahkan nilainyya sebagai real
        String P = "12.34"; 
        String Q = "56.78"; 
        String R = P + Q;   
        Double D = Double.parseDouble(P) + Double.parseDouble(Q); // Menggunakan Double.parseDouble()
        System.out.println("Hasil konkatenasi R    : " + R);
        System.out.println("Hasil penjumlahan D    : " + D);

        // e. Konversi Hasil Konkatenasi String menjadi Integer
        Integer A = Integer.parseInt(S); 
        System.out.println("Nilai Integer dari S : " + A); 

        // f. Konversi Nilai Integer kembali menjadi String
        String T = A.toString();   // Menggunakan toString()
        System.out.println("Nilai String  dari A  : " + T); 
    }
}