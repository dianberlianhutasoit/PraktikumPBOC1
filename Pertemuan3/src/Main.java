/* Nama File    : Main.java
Deskripsi       : Berisi implementasi dari class Dosen, Kendaraan, Mata Kuliah, Mahasiswa
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 6 Maret 2026
LAB             : C1
*/

public class Main {
    public static void main(String[] args) {
        /* --- DRIVER DOSEN --- */

        // Implementasi Konstruktor tanpa parameter
        Dosen D1 = new Dosen();  //Tes Konstruktor dosen tanpa parameter
        D1.printDosen();

        // Implementasi Konstruktor dengan parameter
        Dosen D2 = new Dosen("200654515", "Dian", "Informatika");
        D2.printDosen();

        // Implementasi Selektor untuk mengambil data atribut dosen
        System.out.println("NIP Dosen D2 adalah " + D2.getNIP());
        System.out.println("Nama Dosen D2 adalah " + D2.getNama());
        System.out.println("Prodi Dosen D2 adalah " + D2.getProdi());

        // Implementasi Mutator untuk mengubah nilai atribut dosen
        D1.setNIP("2003515582");
        D1.setNama("Berlian");
        D1.setProdi("Kedokteran");
        D1.printDosen();

        System.out.println();
        System.out.println("************************************");

        /* --- DRIVER MATA KULIAH --- */

        // Implementasi Konstruktor tanpa parameter
        MataKuliah MK1 = new MataKuliah();
        MK1.printMatkul();

        // Implementasi Konstruktor dengan parameter
        MataKuliah MK2 = new MataKuliah("MK126", "PBO", 3);
        MK2.printMatkul();

        // Implementasi Selektor untuk mengambil data mata kuliah
        System.out.println("ID Matakuliah MK2 adalah " + MK2.getID());
        System.out.println("Nama Matakuliah MK2 adalah " + MK2.getNama());
        System.out.println("SKS Matakuliah MK2 adalah " + MK2.getSKS());

        // Implementasi Mutator untuk mengubah atribut mata kuliah
        MK1.setID("MK124");
        MK1.setNama("Struktur Data");
        MK1.setSKS(4);
        MK1.printMatkul();

        System.out.println();
        System.out.println("************************************");

        /* --- DRIVER KENDARAAN --- */

        // Implementasi Konstruktor tanpa parameter
        Kendaraan K1 = new Kendaraan();
        K1.printKendaraan();

        // Implementasi Konstruktor dengan parameter
        Kendaraan K2 = new Kendaraan("B 1284 CC", "Motor");
        K2.printKendaraan();

        // Implementasi Selektor untuk mengambil data kendaraan
        System.out.println("No. Plat Kendaraan K2 adalah : " + K2.getNoPlat());
        System.out.println("Jenis Kendaraan K2 adalah : " + K2.getJenis());

        // Implementasi Mutator untuk mengubah atribut kendaraan
        K1.setNoPlat("BK 1640 JK");
        K1.setJenis("Mobil");
        K1.printKendaraan();

        System.out.println();
        System.out.println("************************************");

        /* --- DRIVER MAHASISWA --- */

        // Implementasi Konstruktor tanpa parameter
        Mahasiswa Mhs1 = new Mahasiswa();
        Mhs1.printMhs();

        // Implementasi Konstruktor dengan parameter
        Mahasiswa Mhs2 = new Mahasiswa("24028", "Yiyi", "Informatika");
        Mhs2.printMhs();

        // Implementasi Selektor untuk mengambil data mahasiswa
        System.out.println("NIM dari Mhs2 adalah " + Mhs2.getNIM());
        System.out.println("Nama dari Mhs2 adalah " + Mhs2.getNama());
        System.out.println("Prodi dari Mhs2 adalah " + Mhs2.getProdi());
        System.out.println("Dosen Wali dari Mhs2 adalah " + Mhs2.getDosenWali());
        System.out.println();
        
        // Implementasi Mutator untuk mengubah data mahasiswa
        Mhs1.setNIM("2422452");
        Mhs1.setNama("Kayla");
        Mhs1.setProdi("Kedokteran");
        Mhs1.printMhs();

        /* Implementasi relasi objek (Agregasi) Mahasiswa memiliki Dosen Wali, Kendaraan,
           dan daftar Mata Kuliah */
        Mhs2.setDosenWali(D2);
        Mhs2.setKendaraan(K1);
        Mhs2.addMatkul(MK1);
        Mhs2.addMatkul(MK2);

        // Mengambil data objek agregasi menggunakan selektor
        System.out.println("Nama Dosen Wali Mhs2 sekarang adalah " + Mhs2.getDosenWali().getNama());
        System.out.println("Jenis Kendaraan yang dimiliki oleh Mhs2 adalah " + Mhs2.getKendaraan().getJenis());

        // Implementasi method perhitungan jumlah SKS
        System.out.println("Jumlah SKS yang diambil oleh Mhs2 adalah " + Mhs2.getJumlahSKS());
        
        // Implementasi method untuk menghitung jumlah mata kuliah
        System.out.println("Jumlah Matkul yang diambil oleh Mhs2 adalah " + Mhs2.getJumlahMatkul());

        System.out.println();
        System.out.println("************************************");

        // Implementasi method untuk menampilkan detail lengkap mahasiswa
        System.out.println("Data detail dari Mhs2 adalah : ");
        Mhs2.printDetailMhs();
        
    }
    
}
