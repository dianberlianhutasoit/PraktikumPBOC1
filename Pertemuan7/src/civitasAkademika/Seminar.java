package civitasAkademika;

/* Nama File    : Seminar.java
Deskripsi       : Berisi atribut dan Method dalam Class Seminar
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 28 April 2026
LAB             : C1
*/

public class Seminar {
    /* --- ATRIBUT --- */ 
    private CivitasAkademika[] pesertas;
    private int banyakpeserta;

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Menginisialisasi kapasitas peserta maksimal 100 dan banyaknya peserta awal = 0
    public Seminar() {
        this.pesertas = new CivitasAkademika[100];
        this.banyakpeserta = 0;
    }

    /* SELEKTOR */
    // Mengembalikan banyaknya peserta seminar saat ini
    public int countPeserta() {
        return this.banyakpeserta;
    }

    /* METHOD LAIN */
    // Memasukkan objek peserta (Dosen/Mahasiswa) ke dalam array
    public void registrasi(CivitasAkademika peserta) {
        if (this.banyakpeserta < this.pesertas.length) {
            this.pesertas[this.banyakpeserta] = peserta;
            this.banyakpeserta++;
        } else {
            System.out.println("Kuota pendaftaran seminar sudah penuh!");
        }
    }

    // Menampilkan daftar Nomor dan Nama seluruh peserta
    public void tampilPeserta() {
        for (int i = 0; i < this.banyakpeserta; i++) {
            System.out.println((i + 1) + ". " + this.pesertas[i].getNomor() + " - " + this.pesertas[i].getNama());
        }
    }

    // Menghitung banyaknya peserta yang khusus bertipe Mahasiswa
    public int countMahasiswa() {
        int jumlahMhs = 0;
        for (int i = 0; i < this.banyakpeserta; i++) {
            // Pengecekan tipe kelas menggunakan instanceof
            if (this.pesertas[i] instanceof Mahasiswa) {
                jumlahMhs++;
            }
        }
        return jumlahMhs;
    }
}