/* Nama File    : mainDatum.java
Deskripsi       : Driver program untuk menguji implementasi class generik Datum
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 5 Mei 2026
LAB             : C1
*/

public class mainDatum {
    
    /* --- METHOD --- */

    /* METHOD MAIN */
    public static void main(String[] args) {

        /* DATUM DENGAN TIPE DASAR  */
        
        // 1. Datum String
        Datum<String> dString = new Datum<>();
        dString.setIsi("Seekor Kucing Anggora");
        System.out.println("Isi Datum String  : " + dString.getIsi());

        // 2. Datum Integer
        Datum<Integer> dInt = new Datum<>();
        dInt.setIsi(16);
        System.out.println("Isi Datum Integer : " + dInt.getIsi());

        // 3. Datum Double
        Datum<Double> dDouble = new Datum<>();
        dDouble.setIsi(2.007);
        System.out.println("Isi Datum Double  : " + dDouble.getIsi());
        System.out.println();


        // Membuat berbagai objek turunan Anabul
        Anabul A1 = new Anjing("Mopi");
        Anabul A2 = new Kucing("Bibing", 4.5);
        Anabul A3 = new Burung("Cicit");


        /*  UJI OBJEK ANABUL (INCLUSION) */
        System.out.println(" --- UJI OBJEK ANABUL --- ");
        
        // Uji Objek A1 (Anjing)
        System.out.println("Nama  : " + A1.getNama());
        A1.Gerak();
        A1.Bersuara();
        System.out.println();

        // Uji Objek A2 (Kucing) 
        System.out.println("Nama  : " + A2.getNama());
        A2.Gerak();
        A2.Bersuara();
        if (A2 instanceof Kucing) {
            Kucing K = (Kucing) A2;
            System.out.println("Bobot awal : " + K.getBobot() + " kg");
            K.setBobot(5.0);
            System.out.println("Bobot baru : " + K.getBobot() + " kg");
        }
        System.out.println();

        // Uji Objek A3 (Burung)
        System.out.println("Nama  : " + A3.getNama());
        A3.Gerak();
        A3.Bersuara();
        System.out.println();


        /*  UJI GENERIK DATUM (ANABUL)  */
        System.out.println(" --- UJI GENERIK DATUM (ANABUL) --- ");
        
        Datum<Anabul> D1 = new Datum<>();
        Datum<Anabul> D2 = new Datum<>();
        Datum<Anabul> D3 = new Datum<>();

        // Memasukkan objek Anabul ke dalam wadah Datum
        D1.setIsi(A1);
        D2.setIsi(A2);
        D3.setIsi(A3);

        // Menampilkan isi Datum
        System.out.println("Isi Datum D1 : " + D1.getIsi().getNama());
        System.out.println("Isi Datum D2 : " + D2.getIsi().getNama());
        System.out.println("Isi Datum D3 : " + D3.getIsi().getNama());
    }
}