package LatihanPajak;

/* Nama File    : Pengusaha.java
Deskripsi       : Berisi atribut dan Method dalam Class Pengusaha (Turunan Manusia, Implementasi Pajak)
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 30 Maret 2026
LAB             : C1
*/

import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    /* --- ATRIBUT --- */
    private String npwp;
    private static int counterPengusaha = 0;

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Pengusaha() {
        super();
        this.npwp = "-";
        counterPengusaha++;
    }

    // Konstruktor dengan parameter
    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    /* SELEKTOR */
    // Mengembalikan nilai NPWP Pengusaha
    public String getNPWP() {
        return this.npwp;
    }

    // Mengembalikan jumlah objek Pengusaha
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    /* MUTATOR */
    // Mengubah atau menetapkan nilai NPWP 
    public void setNPWP(String NPWP) {
        this.npwp = NPWP;
    }

    /* IMPLEMENTASI ABSTRACT METHOD DARI CLASS Manusia */
    // Menghitung total masa kerja Pengusaha
    @Override
    public int hitungMasaKerja() {
        int now = LocalDate.now().getYear();
        int tahunMulai = tgl_mulai_kerja.getYear();
        int B = 0;   // Digit ke 13 dari NIM

        return (now - tahunMulai) + B;
    }

    /* IMPLEMENTASI METHOD DARI Interface Pajak */
    // Menghitung total pajak Pengusaha
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    /* METHOD LAIN */
    // Mencetak informasi lengkap Pengusaha
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP : " + npwp);
        System.out.println("Masa Kerja : " + hitungMasaKerja());
        System.out.println("Pajak : " + hitungPajak());
    }
}