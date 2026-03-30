package LatihanPegawai;
/* Nama File    : Pegawai.java
Deskripsi       : Berisi atribut dan Method dalam Class Pegawai
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 12 Maret 2026
LAB             : C1
*/

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    /* --- ATRIBUT --- */
    // Atribut dasar yang akan dimiliki oleh semua jenis pegawai
    protected String NIP;
    protected String Nama;
    protected LocalDate Tanggal_Lahir;
    protected LocalDate TMT;
    protected double gaji_pokok;

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter untuk membuat objek dengan data kosong/bawaan
    public Pegawai() {
        this.NIP = "-";
        this.Nama = "-";
        this.Tanggal_Lahir = LocalDate.now();
        this.TMT = LocalDate.now();
        this.gaji_pokok = 0.0;
    }

    // Konstruktor berparameter lengkap
    public Pegawai(String NIP, String Nama, LocalDate tglLahir, LocalDate TMT, double gaji_pokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Tanggal_Lahir = tglLahir;
        this.TMT = TMT;
        this.gaji_pokok = gaji_pokok;
    }

    /* SELEKTOR */
    // Kumpulan method untuk mengambil nilai dari atribut pegawai

    // Mengambil nilai NIP
    public String getNIP() {
        return this.NIP;
    }

    // Mengambil nilai Nama
    public String getNama() {
        return this.Nama;
    }

    // Mengambil Tanggal Lahir
    public LocalDate getTanggalLahir() {
        return this.Tanggal_Lahir;
    }

    // Mengambil TMT
    public LocalDate getTMT() {
        return this.TMT;
    }

    // Mengambil jumlah gaji pokok
    public double getGajiPokok() {
        return this.gaji_pokok;
    }

    /* MUTATOR */
    // Kumpulan method untuk mengubah atau memperbarui data atribut pegawai

    // Mengubah atau menetapkan NIP
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    // Mengubah atau menetapkan Nama
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    // Mengubah atau menetapkan tanggal lahir
    public void setTanggalLahir(LocalDate tglLahir) {
        this.Tanggal_Lahir = tglLahir;
    }

    // Mengubah atau menetapkan TMT
    public void setTMT(LocalDate TMT) {
        this.TMT = TMT;
    }

    // Mengubah atau menetapkan gaji pokok
    public void setGajiPokok(double gajiPokok) {
        this.gaji_pokok = gajiPokok;
    }

    /* METHOD LAIN */
    // Menghitung masa kerja dari TMT hingga waktu saat ini
    public Period getMasaKerja() {
        return Period.between((TMT), LocalDate.now());
    } 

    // Mengubah format tanggal standar sistem menjadi format yang lebih mudah dibaca
    public String formatTanggal(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.forLanguageTag("id-ID"));
        return date.format(formatter);
    }

    // Mengubah format angka desimal menjadi format mata uang Rupiah
    public String formatRupiah(double nominal) {
        NumberFormat Rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return Rupiah.format(nominal);
    }

    // Mencetak informasi dasar dari pegawai
    public void printInfoPegawai() {
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + Nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(Tanggal_Lahir));
        System.out.println("TMT : " + formatTanggal(TMT));
        System.out.println("Gaji Pokok :" + formatRupiah(gaji_pokok));
    }
}