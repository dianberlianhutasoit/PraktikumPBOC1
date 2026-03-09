/*Nama : Dian Berlian Hutasoit
NIM : 24060124120005
LAB : C1 */

public class Dosen {
    /* --- ATRIBUT ---  */
    private String NIP;
    private String Nama;
    private String Prodi;

    /* --- METHOD --- */

    // Konstruktor
    public Dosen() {
        this.NIP = "-";
        this.Nama = "-";
        this.Prodi = "-";
    }

    public Dosen(String NIP, String Nama, String Prodi) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    // Selektor
    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return Nama;
    }

    public String getProdi() {
        return Prodi;
    }

    // Mutator
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    public void printDosen() {
        System.out.println("NIP : " + NIP + "," + " Nama : " + Nama + "," + " Prodi : " + Prodi );
    }
}
