public class Main {
    public static void main(String[] args) {
        /* --- DRIVER DOSEN --- */
        // Konstrukor
        Dosen D1 = new Dosen();  //Tes Konstruktor dosen tanpa parameter
        D1.printDosen();
        Dosen D2 = new Dosen("200654515", "Dian", "Informatika");
        D2.printDosen();

        // Selektor
        System.out.println("NIP Dosen D2 adalah " + D2.getNIP());
        System.out.println("Nama Dosen D2 adalah " + D2.getNama());
        System.out.println("Prodi Dosen D2 adalah " + D2.getProdi());

        // Mutator
        D1.setNIP("2003515582");
        D1.setNama("Berlian");
        D1.setProdi("Kedokteran");
        D1.printDosen();
        System.out.println("************************************");

        /* --- DRIVER MATA KULIAH --- */
        // Konstruktor
        MataKuliah MK1 = new MataKuliah();
        MK1.printMatkul();
        MataKuliah MK2 = new MataKuliah("MK126", "PBO", 3);
        MK2.printMatkul();

        // Selektor
        System.out.println("ID Matakuliah MK2 adalah " + MK2.getID());
        System.out.println("Nama Matakuliah MK2 adalah " + MK2.getNama());
        System.out.println("SKS Matakuliah MK2 adalah " + MK2.getSKS());

        //Mutator
        MK1.setID("MK124");
        MK1.setNama("Struktur Data");
        MK1.setSKS(4);
        MK1.printMatkul();
        System.out.println("************************************");

        /* --- DRIVER KENDARAAN --- */
        // Konstruktor
        Kendaraan K1 = new Kendaraan();
        K1.printKendaraan();
        Kendaraan K2 = new Kendaraan("B 1284 CC", "Motor");
        K2.printKendaraan();

        // Selektor
        System.out.println("No. Plat Kendaraan K2 adalah : " + K2.getNoPlat());
        System.out.println("Jenis Kendaraan K2 adalah : " + K2.getJenis());

        // Mutator
        K1.setNoPlat("BK 1640 JK");
        K1.setJenis("Mobil");
        K1.printKendaraan();

    }
    
}
