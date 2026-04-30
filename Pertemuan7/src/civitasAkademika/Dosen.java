package civitasAkademika;

/* Nama File    : Dosen.java
Deskripsi       : Berisi atribut dan Method dalam Class Dosen
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 28 April 2026
LAB             : C1
*/

public class Dosen extends CivitasAkademika {
    /* --- ATRIBUT --- */ 
    private String NIP;

    /* --- METHOD --- */

    /* KONSTRUKTOR */
    // Konstruktor tanpa parameter
    public Dosen() {
        super();
        this.NIP = "";
    }

    // Konstruktor dengan parameter
    public Dosen(String Nama, String NIP) {
        super(Nama);
        this.NIP = NIP;
    }

    /* SELEKTOR */
    // Mengambil nilai NIP
    public String getNIP() {
        return this.NIP;
    }

    /* MUTATOR */
    // Mengubah atau menetapkan nilai NIP
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    /* OVERRIDING METHOD */
    // Mengembalikan nomor identitas dosen berupa NIP
    @Override
    public String getNomor() {
        return this.NIP;
    }

    /* METHOD LAIN */
    // Menampilkan informasi dosen berupa nama dan NIP.
    public void printInfo(){
        System.out.println("Nama: " + getNama());
        System.out.println("NIP: " + getNomor());
    }
}