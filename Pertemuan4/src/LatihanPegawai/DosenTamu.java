package LatihanPegawai;
/* Nama File    : DosenTamu.java
Deskripsi       : Berisi atribut dan Method dalam Class Dosen Tamu
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 12 Maret 2026
LAB             : C1
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    /* --- ATRIBUT --- */
    // Dosen tamu menggunakan NIDK dan memiliki batas tanggal kontrak
    private String NIDK;
    private LocalDate TanggalAkhirKontrak;

    /* --- METHOD --- */
    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public DosenTamu() {
        super();
        this.NIDK = "-";
        this.TanggalAkhirKontrak = LocalDate.now();
    }

    // Konstruktor berparameter lengkap
    public DosenTamu(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double gaji_pokok, String Fakultas, String NIDK, LocalDate TanggalAkhirKontrak) {
        super(NIP, Nama, TanggalLahir, TMT, gaji_pokok, Fakultas);
        this.NIDK = NIDK;
        this.TanggalAkhirKontrak = TanggalAkhirKontrak;
    }

    /* SELEKTOR */
    // Mengambil nilai NIDK
    public String getNIDK() {
        return this.NIDK;
    }

    // Mengambil Tanggal Berakhir Kontrak
    public LocalDate getTanggalBerakhirKontrak() {
        return this.TanggalAkhirKontrak;
    }

    /* MUTATOR */
    // Mengubah atau menetapkan NIDK
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    // Mengubah atau menetapkan tanggal berakhir kontrak
    public void setTglBerakhirKontrak(LocalDate TglAkhirKontrak) {
        this.TanggalAkhirKontrak = TglAkhirKontrak;
    }

    /* METHOD LAIN */
    // Menghitung sisa bulan dari kontrak kerja
    public int getSisaKontrakBulan() {
        Period sisaWaktu = Period.between(LocalDate.now(), this.TanggalAkhirKontrak);
        return (sisaWaktu.getYears() * 12) + sisaWaktu.getMonths();
    }

    // Menghitung tunjangan langsung dari persentase gaji pokok
    public double getTunjangan() {
        return 0.025 * super.getGajiPokok();
    }

    // Mencetak informasi lengkap Dosen Tamu
    @Override
    public void printInfoPegawai() {
        System.out.println("NIP : " + this.NIP);
        System.out.println("NIDK : " + this.NIDK); 
        System.out.println("Nama : " + this.Nama);
        System.out.println("Tanggal Lahir : " + super.formatTanggal(this.Tanggal_Lahir));
        System.out.println("TMT : " + super.formatTanggal(this.TMT));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + this.Fakultas);
        
        // Menampilkan Masa Kerja
        Period masaKerja = super.getMasaKerja();
        System.out.println("Masa Kerja : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Sisa Kontrak : " + getSisaKontrakBulan() + " bulan");
        System.out.println("Gaji Pokok : " + super.formatRupiah(this.gaji_pokok));
        System.out.println("Tunjangan : 2,5% x " + super.formatRupiah(this.gaji_pokok) + " : " + super.formatRupiah(getTunjangan()));
    }
}