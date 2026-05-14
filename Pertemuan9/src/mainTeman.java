/* Nama File    : mainTeman.java
Deskripsi       : Driver program untuk menguji kelas Teman dan Exception Handling
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 7 Mei 2026
LAB             : C1
*/


public class mainTeman {
    public static void main(String[] args) {
        // Inisialisasi Koleksi Teman
        Teman T1 = new Teman();

        // Uji addNama
        T1.addNama("Dian");
        T1.addNama("Berlian");
        T1.addNama("Tia");
        T1.addNama("Sri");
        T1.addNama("Kesia");
        T1.addNama("Dian");

        System.out.println("********************************************************");

        // Uji getNbElm
        System.out.println("Jumlah Elemen : " + T1.getNbElm());

        // Uji getNama
        try {
            System.out.println("Nama pada indeks ke-0 : " + T1.getNama(0));
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Eror : " + e.getMessage());
        }

        System.out.println("********************************************************");
        
        // Uji setNama
        try {
            System.out.print("Set Nama pada indeks ke -1 : ");
            T1.setNama(-1, "Yaya");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Eror " + e.getMessage());
        } 
        
        // Uji delNama dan ShowTeman
        T1.delNama("Dian");
        T1.showTeman();

        System.out.println("\n********************************************************");

        // Uji IsMember
        System.out.println("Apakah Yaya ada dalam List ? " + T1.isMember("Yaya"));
        System.out.println("Apakah Sri ada dalam List ? " + T1.isMember("Sri"));

        // Uji gantiNama
        try {
            T1.gantiNama("Dian", "Diamond");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Eror" + e.getMessage());
        }
        T1.showTeman();

        System.out.println("\n********************************************************");

        // Uji countNama
        System.out.println("Nama Dian dalam List ditemukan sebanyak : " + T1.countNama("Dian"));

        T1.showTeman();

        System.out.println("\n********************************************************");
    }
}