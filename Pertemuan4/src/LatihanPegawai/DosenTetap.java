package LatihanPegawai;
/* Nama File    : DosenTetap.java
Deskripsi       : Berisi atribut dan Method dalam Class Dosen Tetap
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 12 Maret 2026
LAB             : C1
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    /* --- ATRIBUT --- */
    // Dosen Tetap memiliiki NIDN dan BUP yang bernilai tetap
    private String NIDN;
    private static final int BUP = 65; 

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public DosenTetap() {
        super();
        this.NIDN = "-";
    }

    // Konstruktor berparameter lengkap
    public DosenTetap(String NIP, String Nama, LocalDate tglLahir, LocalDate TMT, double gaji_pokok, String Fakultas, String NIDN) {
        super(NIP, Nama, tglLahir, TMT, gaji_pokok, Fakultas);
        this.NIDN = NIDN;
    }

    /* SELEKTOR */
    // Mengambil nilai NIDN
    public String getNIDN() {
        return this.NIDN;
    }

    /* MUTATOR */
    // Mengubah atau menetapkan NIDN
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    /* METHOD LAINNYA */
    // Menghitung tanggal jatuh tempo pensiun
    public LocalDate getTanggalPensiun() {
        // Tanggal lahir ditambah usia BUP, lalu digeser ke bulan depannya pada tanggal 1
        return super.getTanggalLahir().plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    // Menghitung tunjangan khusus dosen tetap
    public double getTunjangan() {
        int Tahun_Kerja = super.getMasaKerja().getYears();
        return 0.02 * Tahun_Kerja * super.getGajiPokok();
    }

    // Mencetak informasi lengkap Dosen Tetap
    @Override
    public void printInfoPegawai() {
        System.out.println("NIP : " + this.NIP);
        System.out.println("NIDN : " + this.NIDN);
        System.out.println("Nama : " + this.Nama);
        System.out.println("Tanggal Lahir : " + super.formatTanggal(this.Tanggal_Lahir));
        System.out.println("TMT : " + super.formatTanggal(this.TMT));
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + this.Fakultas);
        
        Period masaKerja = super.getMasaKerja();
        System.out.println("Masa Kerja : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + super.formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok : " + super.formatRupiah(this.gaji_pokok));
        System.out.println("Tunjangan : 2% x " + masaKerja.getYears() + " x " + super.formatRupiah(this.gaji_pokok) + " : " + super.formatRupiah(getTunjangan()));
    }
}