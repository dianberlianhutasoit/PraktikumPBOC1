/* Nama File    : Mahasiswa.java
Deskripsi       : Berisi atribut dan Method dalam Class Titik
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 6 Maret 2026
LAB             : C1
*/

import java.util.ArrayList;

public class Mahasiswa {
    /* --- ATRIBUT --- */
    private String NIM;
    private String Nama;
    private String Prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* --- METHOD --- */

    /* KONSTRUKTOR */

    // Konstruktor tanpa parameter untuk membuat objek mahasiswa dengan nilai awal
    public Mahasiswa() {
        this.NIM = "-";
        this.Nama = "-";
        this.Prodi = "-";
        this.listMatkul = new ArrayList<>();
    }

    // Konstruktor dengan parameter untuk membuat objek mahasiswa sesuai dengan nilai yang diinput
    public Mahasiswa(String NIM, String Nama, String Prodi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.listMatkul = new ArrayList<>();
    }

    /* SELEKTOR */

    // Method untuk mengambil nilai NIM mahasiswa
    public String getNIM() {
        return NIM;
    }

    // Method untuk mengambil nama mahasiswa
    public String getNama() {
        return Nama;
    }

    // Method untuk mengambil program studi mahasiswa
    public String getProdi() {
        return Prodi;
    }

    // Method untuk mengambil data dosen wali mahasiswa
    public Dosen getDosenWali() {
        return dosenWali;
    }

    // Method untuk mengambil data kendaraan mahasiswa
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    /* MUTATOR */

    // Method untuk mengubah atau menetapkan NIM mahasiswa
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    // Method untuk mengubah atau menetapkan nama mahasiswa
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    // Method untuk mengubah atau menetapkan program studi mahasiswa
    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    /* Method Lain */

    // // Method untuk menampilkan informasi dasar mahasiswa
    public void printMhs() {
        System.out.println("Nim : " + NIM + "," + " Nama : " + Nama + "," + " Prodi : " + Prodi);
    }

    // METHOD AGREGASI

    // Method untuk menetapkan dosen wali mahasiswa
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // Method untuk menetapkan kendaraan yang dimiliki mahasiswa
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Method untuk menambahkan mata kuliah ke dalam daftar mata kuliah mahasiswa
    public void addMatkul(MataKuliah newMatkul) {
        this.listMatkul.add(newMatkul);
    }

    // Method untuk menghitung total SKS dari seluruh mata kuliah yang diambil mahasiswa
    public int getJumlahSKS() {
        //kamus lokal
        int totalSKS = 0;
        int i;

        //algoritma
        for(i = 0; i < listMatkul.size(); i++) {
            totalSKS += listMatkul.get(i).getSKS();
        }
        return totalSKS;
    }

    // Method untuk menghitung jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatkul() {
        return this.listMatkul.size();
    }

    // Method untuk menampilkan detail lengkap mahasiswa beserta daftar mata kuliahnya
    public void printDetailMhs() {
        System.out.println("Nim : " + NIM);
        System.out.println("Nama : " + Nama);
        System.out.println("Prodi : " + Prodi);

        int i;
        for(i = 0; i < listMatkul.size(); i++) {
            System.out.println(listMatkul.get(i).getNama());
        }

    }
}