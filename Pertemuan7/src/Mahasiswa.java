/* Nama File    : Mahasiswa.java
Deskripsi       : Berisi atribut dan method untuk penerapan Polimorfisme Ad Hoc Overloading
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 28 April 2026
LAB             : C1
*/

public class Mahasiswa {
    /* --- Atribut --- */
    int NIM;
    String Nama;
    String Programstudi;

    /* --- METHOD --- */
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.NIM = -999;
        this.Nama = "";
        this.Programstudi = "";
    }

    // Konstruktor dengan parameter
    public Mahasiswa(int NIM, String Nama, String Programstudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    // Konstruktor dengan parameter objek Mahasiswa lain 
    public Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.Programstudi = m.Programstudi;
    }

    /* SELEKTOR (GETTER) */

    // Mengambil Nilai NIM
    public int getNIM() {
        return this.NIM;
    }

    // Mengambil nilai Nama
    public String getNama() {
        return this.Nama;
    }

    // Mengambil nilai Program Studi
    public String getProgramstudi() {
        return this.Programstudi;
    }

    /* MUTATOR (SETTER) */
    
    // Mengubah atau menetapkan nilai NIM
    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    // Mengubah atau menetapkan nilai Nama
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    // Mengubah atau menetapkan nilai Program Studi
    public void setProgramstudi(String Programstudi) {
        this.Programstudi = Programstudi;
    }

    /* Overloading method setProgramStudi */

    // 1. setProgramStudi tanpa parameter
    public void setProgramStudi() {
        this.Programstudi = "Kosong";
    }

    // 2. setProgramStudi dengan 1 parameter String
    public void setProgramStudi(String prodi) {
        this.Programstudi = prodi;
    }

    // 3. setProgramStudi dengan 1 parameter objek Mahasiswa
    public void setProgramStudi(Mahasiswa m) {
        this.Programstudi = m.Programstudi;
    }

    /* --- METHOD LAIN --- */
    // menampilkan Informasi mahasiswa
    public void printInfo() {
        System.out.println("NIM: " + this.NIM);
        System.out.println("Nama: " + this.Nama);
        System.out.println("Program Studi: " + this.Programstudi);
    }
}