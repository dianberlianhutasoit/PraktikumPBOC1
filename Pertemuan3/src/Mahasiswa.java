/*Nama :
NIM :
LAB :
Tanggal : */

import java.util.ArrayList;

public class Mahasiswa {
    //atribut
    private String NIM;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    
    //Kosntruktor
    public Mahasiswa() {
        this.NIM = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    //Selektor
    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public Dosen getDosen() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    //MUTATOR
    
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    
    public void setProdi(String Prodi) {
        this.prodi = Prodi;
    }
    
    public void addMatkul(MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        int i;
        for(i = 0; i<listMatkul.size(); i++) {
            totalSKS = totalSKS + listMatkul.get(i).getSKS();
        }
        return totalSKS;
    }
    





    
    
}
