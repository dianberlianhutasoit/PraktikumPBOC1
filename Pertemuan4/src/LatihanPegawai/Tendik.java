package LatihanPegawai;
/* Nama File    : Tendik.java
Deskripsi       : Berisi atribut dan Method dalam Class Tendik
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 12 Maret 2026
LAB             : C1
*/

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    /* --- ATRIBUT --- */
    private String Bidang;
    private static final int BUP = 55; // Batas Usia Pensiun Tendik adalah 55 tahun

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Tendik() {
        super();
        this.Bidang = "-";
    }

    // Konstruktor berparameter lengkap
    public Tendik(String NIP, String Nama, LocalDate tglLahir, LocalDate TMT, double gaji_pokok, String Bidang) {
        super(NIP, Nama, tglLahir, TMT, gaji_pokok);
        this.Bidang = Bidang;
    }

    /* SELEKTOR */
    // Mengambil data Bidang
    public String getBidang() {
        return this.Bidang;
    }

    /* MUTATOR */
    // Mengubah atau menetapkan nilai bidang
    public void setBidang(String Bidang) {
        this.Bidang = Bidang;
    }

    /* METHOD LAINNYA */
    // Menghitung tanggal pensiun Tendik
    public LocalDate getTanggalPensiun() {
        return super.getTanggalLahir().plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    // Menghitung tunjangan Tendik (1% dari masa kerja kali gaji)
    public double getTunjangan() {
        int Tahun_Kerja = super.getMasaKerja().getYears();
        return 0.01 * Tahun_Kerja * super.getGajiPokok();
    }

    // Mencetak informasi lengkap pegawai
    @Override
    public void printInfoPegawai() {
        System.out.println("NIP : " + this.NIP);
        System.out.println("Nama : " + this.Nama);
        System.out.println("Tanggal Lahir : " + super.formatTanggal(this.Tanggal_Lahir));
        System.out.println("TMT : " + super.formatTanggal(this.TMT));
        System.out.println("Jabatan : Tenaga Kependidikan");
        System.out.println("Bidang : " + this.Bidang);
        
        Period masaKerja = super.getMasaKerja();
        System.out.println("Masa Kerja : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + super.formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok : " + super.formatRupiah(this.gaji_pokok));
        System.out.println("Tunjangan : 1% x " + masaKerja.getYears() + " x " + super.formatRupiah(this.gaji_pokok) + " : " + super.formatRupiah(getTunjangan()));
    }
}