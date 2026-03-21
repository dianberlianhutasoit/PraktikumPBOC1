/* Nama File    : DosenTamu.java
Deskripsi       : Berisi atribut dan Method dalam Class Dosen Tamu
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 12 Maret 2026
LAB             : C1
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    /* ATRIBUT */
    // Dosen tamu menggunakan NIDK dan memiliki batas tanggal kontrak
    private String NIDK;
    private LocalDate TanggalAkhirKontrak;

    /* METHOD */
    // KONSTRUKTOR
    public DosenTamu() {
        super();
        this.NIDK = "-";
        this.TanggalAkhirKontrak = LocalDate.now();
    }

    public DosenTamu(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double gaji_pokok, String Fakultas, String NIDK, LocalDate TanggalAkhirKontrak) {
        super(NIP, Nama, TanggalLahir, TMT, gaji_pokok, Fakultas);
        this.NIDK = NIDK;
        this.TanggalAkhirKontrak = TanggalAkhirKontrak;
    }

    // SELEKTOR
    public String getNIDK() {
        return this.NIDK;
    }

    public LocalDate getTanggalBerakhirKontrak() {
        return this.TanggalAkhirKontrak;
    }

    // MUTATOR
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    public void setTglBerakhirKontrak(LocalDate TglAkhirKontrak) {
        this.TanggalAkhirKontrak = TglAkhirKontrak;
    }

    // METHOD LAIN
    // Menghitung sisa bulan dari kontrak kerja
    public int getSisaKontrakBulan() {
        Period sisaWaktu = Period.between(LocalDate.now(), this.TanggalAkhirKontrak);
        return (sisaWaktu.getYears() * 12) + sisaWaktu.getMonths();
    }

    // Menghitung tunjangan langsung dari persentase gaji pokok
    public double getTunjangan() {
        return 0.025 * super.getGajiPokok();
    }

    @Override
    public void printInfoPegawai() {
        System.out.println("NIP : " + this.NIP);
        System.out.println("NIDK : " + this.NIDK); // Ingat, dosen tamu pakainya NIDK
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