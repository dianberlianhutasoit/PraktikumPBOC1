package LatihanPajak;

/* Nama File    : Petani.java
Deskripsi       : Berisi atribut dan Method dalam Class Petani (Turunan Manusia, Implementasi Pajak)
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 30 Maret 2026
LAB             : C1
*/

import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
    /* --- ATRIBUT --- */
    private String asal_kota;
    private static int counterPetani = 0;

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Petani() {
        super();
        this.asal_kota = "-";
        counterPetani++;
    }

    // Konstruktor dengan parameter
    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asal_kota = asalKota;
        counterPetani++;
    }

    /* SELEKTOR */
    // Mengembalikan asal kota dari petani
    public String getAsalKota() {
        return this.asal_kota;
    }

    // Mengembalikan jumlah objek Petani
    public static int getCounterPetani() {
        return counterPetani;
    }

    /* MUTATOR */
    // Mengubah atau menetapkan nilai asal kota petani
    public void setAsalKota(String asalKota) {
        this.asal_kota = asalKota;
    }

    /* IMPLEMENTASI ABSTRACT METHOD DARI CLASS Manusia */
    // Menghitung total masa kerja Pengusaha
    @Override
    public int hitungMasaKerja() {
        int now = LocalDate.now().getYear();
        int tahunMulai = tgl_mulai_kerja.getYear();
        int C = 0;      // Digit ke 12 dari NIM

        return (now - tahunMulai) + C;
    }

    /* IMPLEMENTASI METHOD DARI Interface Pajak */
    // Menghitung total pajak Petani
    @Override
    public double hitungPajak() {
        return 0.0;
    }

    /* METHOD LAIN */
    // Mencetak informasi lengkap Petani
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota : " + asal_kota);
        System.out.println("Masa Kerja : " + hitungMasaKerja());
        System.out.println("Pajak : " + hitungPajak());
    }
}