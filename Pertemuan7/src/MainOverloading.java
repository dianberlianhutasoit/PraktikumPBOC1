/* Nama File    : MainOverloading.java
Deskripsi       : Berisi main program untuk menguji class Mahasiswa (Overloading)
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 28 April 2026
LAB             : C1
*/

public class MainOverloading {
    public static void main(String[] args) {
                
        System.out.println("--- OVERLOADING KONSTRUKTOR ---");

        // a. Memanggil konstruktor tanpa parameter
        Mahasiswa mhs1 = new Mahasiswa(); 
        System.out.print("Mahasiswa 1 (Default) : "); 
        mhs1.printInfo();

        // b. Memanggil konstruktor dengan 3 parameter
        Mahasiswa mhs2 = new Mahasiswa(240601, "Dian", "Informatika"); 
        System.out.print("Mahasiswa 2 (3 Parameter) : "); 
        mhs2.printInfo();

        // c. Memanggil konstruktor kloning
        Mahasiswa mhs3 = new Mahasiswa(mhs2); 
        System.out.print("Mahasiswa 3 (Kloning) : "); 
        mhs3.printInfo();

        System.out.println("\n--- OVERLOADING PROSEDUR ---");
        
        // d. Memanggil setProgramStudi tanpa parameter
        mhs1.setProgramStudi(); 
        System.out.print("Mahasiswa 1 (Prodi Kosong) : "); 
        mhs1.printInfo();

        // e. Memanggil setProgramStudi parameter String
        mhs1.setProgramStudi("Sistem Informasi"); 
        System.out.print("Mahasiswa 1 (Prodi String) : "); 
        mhs1.printInfo();

        // f. Memanggil setProgramStudi parameter Objek
        mhs1.setProgramStudi(mhs2); 
        System.out.print("Mahasiswa 1 (Prodi Objek)  : "); 
        mhs1.printInfo();
    }
}