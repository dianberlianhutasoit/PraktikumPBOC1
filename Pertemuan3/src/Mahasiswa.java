/* Nama File    : Mahasiswa.java
Deskripsi       : Berisi atribut dan Method dalam Class Titik
Pembuat         : Dian Berlian Hutasoit
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
    // KONSTRUKTOR
    public Mahasiswa() {
        this.NIM = "-";
        this.Nama = "-";
        this.Prodi = "-";
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String NIM, String Nama, String Prodi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.listMatkul = new ArrayList<>();
    }

    // SELEKTOR
    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getProdi() {
        return Prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    // MUTATOR
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    public void printMhs() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Prodi: " + Prodi);
    }

    // AGREGASI
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah newMatkul) {
        this.listMatkul.add(newMatkul);
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        int i;
        for(i = 0; i < listMatkul.size(); i++) {
            totalSKS += listMatkul.get(i).getSKS();
        }
        return totalSKS;
    }

    public int getJumlahMatkul() {
        return listMatkul.size();
    }

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