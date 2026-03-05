public class MDosen {
    public static void main(String[] args) {
        Dosen D1 = new Dosen();
        D1.printDosen();
        Dosen D2 = new Dosen("126598418", "Dian", "Informatika");
        D2.printDosen();

        D1.setNIP("498498184");
        D1.setNama("Husni");
        D1.setProdi("Biologi");
        D1.printDosen();

        System.out.println("NIP = " + D2.getNIP());
        System.out.println("Nama = " + D2.getNama());
        System.out.println("Prodi = " + D2.getProdi());



    
    }
}