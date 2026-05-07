/* Nama File    : mainData.java
Deskripsi       : Driver program untuk menguji implementasi class larik generik Data
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 7 Mei 2026
LAB             : C1
*/

public class mainData {
    
    /* --- METHOD --- */

    /* METHOD MAIN */
    public static void main(String[] args) {

        /* DATA DENGAN TIPE DASAR */
        
        // 1. Data String
        Data<String> dataString = new Data<>();
        dataString.setIsi(1, "Semarang");
        dataString.setIsi(2, "Medan");
        System.out.println("Isi Data String Posisi 1 : " + dataString.getIsi(1));
        System.out.println("Isi Data String Posisi 2 : " + dataString.getIsi(2));
        System.out.println("Size Data String         : " + dataString.getSize());
        System.out.println();

        // 2. Data Integer
        Data<Integer> dataInt = new Data<>();
        dataInt.setIsi(1, 16);
        dataInt.setIsi(2, 24);
        System.out.println("Isi Data Integer Posisi 1 : " + dataInt.getIsi(1));
        System.out.println("Isi Data Integer Posisi 2 : " + dataInt.getIsi(2));
        System.out.println("Size Data Integer         : " + dataInt.getSize());
        System.out.println();

        // 3. Data Double
        Data<Double> dataDouble = new Data<>();
        dataDouble.setIsi(1, 0.5);
        dataDouble.setIsi(2, 3.14);
        System.out.println("Isi Data Double Posisi 1 : " + dataDouble.getIsi(1));
        System.out.println("Isi Data Double Posisi 2 : " + dataDouble.getIsi(2));
        System.out.println("Size Data Double         : " + dataDouble.getSize());
        System.out.println();

        // Membuat berbagai objek turunan Anabul
        Anabul A1 = new Anjing("Mopi");
        Anabul A2 = new Burung("Cicit");
        Anabul A3 = new Kucing("Bibing", 4.5);


        /* UJI GENERIK DATA (ANABUL) */
        System.out.println(" --- UJI GENERIK DATA (ANABUL)  ");
        
        Data<Anabul> dataAnabul = new Data<>();
        System.out.println("Kapasitas total array : " + dataAnabul.getKapasitas());
        System.out.println();
        
        // Memasukkan objek Anabul ke dalam wadah Data
        dataAnabul.setIsi(1, A1);
        dataAnabul.setIsi(2, A2);
        dataAnabul.setIsi(3, A3);

        // Menampilkan isi Data 
        for (int i = 1; i <= dataAnabul.getSize(); i++) {
            System.out.println("Data Posisi " + i + " : " + dataAnabul.getIsi(i).getNama());
            System.out.print("  Gerak : "); dataAnabul.getIsi(i).Gerak();
            System.out.print("  Suara : "); dataAnabul.getIsi(i).Bersuara();
            System.out.println();
        }

        System.out.println("Size akhir : " + dataAnabul.getSize());
    }
}