package LatihanPajak;

/* Nama File    : Manusia.java
Deskripsi       : Berisi atribut dan Method dalam Class Manusia (Abstract)
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 30 Maret 2026
LAB             : C1
*/

import java.time.LocalDate;

public abstract class Manusia {
    /* --- ATRIBUT --- */
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    private static int counterMns = 0;

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Manusia() {
        this.nama = "-";
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = "-";
        this.pendapatan = 0;
        counterMns++;
    }

    // Konstruktor dengan parameter
    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    /* SELEKTOR */
    // Mengambil nilai nama
    public String getNama() {
        return this.nama;
    }

    // Mengambil nilai tanggal mulai kerja
    public LocalDate getTglMulaiKerja() {
        return this.tgl_mulai_kerja;
    }

    // Mengambil nilai alamat
    public String getAlamat() {
        return this.alamat;
    }

    // Mengambil nilai pendapatan
    public double getPendapatan() {
        return this.pendapatan;
    }

    // Mengambil Jumlah Objek Manusia
    public static int getCounterManusia() {
        return counterMns;
    }

    /* MUTATOR */
    // Mengubah atau menetapkan nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengubah atau menetapkan tanggal mulai kerja
    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tgl_mulai_kerja = tglMulaiKerja;
    }

    // Mengubah atau menetapkan alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Mengubah atau menetapkan nilai pendapatan
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    /* ABSTRACT METHOD */
    // Menghitung total masa kerja 
    public abstract int hitungMasaKerja();

    /* METHOD LAIN */
    // Mencetak informasi umum Class Manusia
    public void cetakInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + tgl_mulai_kerja);
        System.out.println("Alamat : " + alamat);
        System.out.println("Pendapatan : " + pendapatan);
    }
    

}