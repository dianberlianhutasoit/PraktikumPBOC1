package LatihanPajak;
/* Nama File    : PNS.java
Deskripsi       : Berisi atribut dan Method dalam Class PNS (Turunan Manusia, Implementasi Pajak)
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 30 Maret 2026
LAB             : C1
*/

import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    /* --- ATRIBUT --- */
    private String nip;
    private static int counterPNS = 0;
    
    /* --- METHOD --- */
    
    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public PNS() {
        super();
        this.nip = "-";
        counterPNS++;
    }

    // Konstruktor dengan parameter
    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    /* SELEKTOR */
    // Mengambil nilai NIP
    public String getNIP() {
        return this.nip;
    }

    // Mengambil jumlah objek PNS
    public static int getCounterPNS() {
        return counterPNS;
    }

    /* MUTATOR */
    // Mengubah atau menetapkan nilai NIP
    public void setNIP(String nip) {
        this.nip = nip;
    }

    /* IMPLEMENTASI ABSTRACT METHOD DARI CLASS Manusia */
    // Menghitung total masa kerja PNS
    @Override
    public int hitungMasaKerja() {
        int now = LocalDate.now().getYear();
        int tahunMulai = tgl_mulai_kerja.getYear();
        int A = 5;      // digit ke 14 dari NIM 

        return (now - tahunMulai) + A;
    }

    /* IMPLEMENTASI METHOD DARI Interface Pajak */
    // Menghitung total pajak PNS
    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    /* METHOD LAIN */
    // Mencetak informasi lengkap PNS
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP : " + nip);
        System.out.println("Masa Kerja : " + hitungMasaKerja());
        System.out.println("Pajak : " + hitungPajak());
    }

}