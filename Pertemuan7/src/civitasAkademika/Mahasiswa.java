package civitasAkademika;

/* Nama File    : Mahasiswa.java
Deskripsi       : Berisi atribut dan Method dalam Class Mahasiswa
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 28 April 2026
LAB             : C1
*/

public class Mahasiswa extends CivitasAkademika {
    /* --- ATRIBUT --- */ 
    private String NIM;
    private Dosen Dosenwali;

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        super();
        this.NIM = "";
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String Nama, String NIM) {
        super(Nama);
        this.NIM = NIM;
    }

    /* SELEKTOR */
    // Mengambil nilai NIM
    public String getNIM() {
        return this.NIM;
    }

    // Mengambil data Dosen Wali
    public Dosen getDosenwali() {
        return this.Dosenwali;
    }

    /* MUTATOR */
    // Mengubah atau menetapkan nilai NIM
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    //  Mengubah atau menetapkan dosen wali mahasiswa
    public void setWali(Dosen dosen) {
        this.Dosenwali = dosen;
    }

    /* OVERRIDING METHOD */
    // Mengembalikan nomor identitas mahasiswa berupa NIM
    @Override
    public String getNomor() {
        return this.NIM;
    }

    /* METHOD LAIN */
    // Menampilkan informasi mahasiswa berupa NIM, nama, dan dosen wali.
    public void printInfo(){
        System.out.println("NIM: " + getNomor());
        System.out.println("Nama: " + getNama());
        if (getDosenwali() != null) 
            {
        System.out.println("Dosen wali: " + getDosenwali().getNama());
        } 
        else {
        System.out.println("Dosen wali: Belum ditentukan");
        }
    }
    
}