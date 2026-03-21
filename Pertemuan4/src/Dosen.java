/* Nama File    : Dosen.java
Deskripsi       : Berisi atribut dan Method dalam Class Dosen
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 12 Maret 2026
LAB             : C1
*/

import java.time.LocalDate;

public class Dosen extends Pegawai {

    /* ATRIBUT */
    // Menambahkan atribut spesifik untuk dosen, yaitu Fakultas
    protected String Fakultas;

    /* METHOD */
    // KONSTRUKTOR
    // Konstruktor tanpa parameter untuk class Dosen
    public Dosen() {
        super(); // Memanggil konstruktor dari class induk (Pegawai)
        this.Fakultas = "-";
    }

    // Konstruktor berparameter lengkap
    public Dosen(String NIP, String Nama, LocalDate tglLahir, LocalDate TMT, double gaji_pokok, String Fakultas) {
        super(NIP, Nama, tglLahir, TMT, gaji_pokok); // Mengirim data dasar ke class Pegawai
        this.Fakultas = Fakultas;
    }

    // SELEKTOR
    // Mengambil nilai Fakultas
    public String getFakultas() {
        return this.Fakultas;
    }

    // MUTATOR
    // Mengubah data Fakultas
    public void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }

    // METHOD LAIN
    // Mencetak informasi dosen dengan memanggil printInfoPegawai dari class induk
    public void PrintInfoDosen() {
        super.printInfoPegawai();
        System.out.println("Fakultas : " + this.Fakultas);
    }
}