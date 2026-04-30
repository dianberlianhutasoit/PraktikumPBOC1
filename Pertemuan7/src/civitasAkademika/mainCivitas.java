package civitasAkademika;

/* 
 * Nama File    : MainSeminar.java
 * Deskripsi    : Program utama untuk menguji class Dosen, Mahasiswa, dan Seminar
 * Pembuat      : Dian Berlian Hutasoit
 * Tanggal      : 30 April 2026
 * LAB          : C1
 */

public class mainCivitas {
    public static void main(String[] args) {

        /* --- DATA DOSEN --- */
        // Membuat objek dosen
        Dosen dsn1 = new Dosen("Dr. Budi Santoso", "19800101");
        dsn1.printInfo();
        System.out.println();

        Dosen dsn2 = new Dosen("Prof. Siti Aminah", "19750202");
        dsn2.printInfo();
        System.out.println();

        /* --- DATA MAHASISWA --- */
        // Membuat objek mahasiswa dan menetapkan dosen wali
        Mahasiswa mhs1 = new Mahasiswa("Dian Berlian Hutasoit", "23020124130076");
        mhs1.setWali(dsn1);
        mhs1.printInfo();
        System.out.println();

        Mahasiswa mhs2 = new Mahasiswa("Kesia Enjelika", "2302012413015");
        mhs2.setWali(dsn1);
        mhs2.printInfo();
        System.out.println();

        Mahasiswa mhs3 = new Mahasiswa("Sri Ratna", "230201241300321");
        mhs3.setWali(dsn2);
        mhs3.printInfo();
        System.out.println();

        // Mahasiswa tambahan untuk didaftarkan ke seminar
        Mahasiswa mhs4 = new Mahasiswa("Tia Glory", "24060124120004");
        mhs4.setWali(dsn2);
        
        Mahasiswa mhs5 = new Mahasiswa("Glen Fredly", "24060124120001");
        mhs5.setWali(dsn1);

        /* --- SEMINAR (POLYMORPHISM) --- */
        // Membuat objek seminar
        Seminar semPBO = new Seminar();
        
        // Mendaftarkan peserta 
        semPBO.registrasi(dsn1);
        semPBO.registrasi(mhs1);
        semPBO.registrasi(mhs2);
        semPBO.registrasi(dsn2);
        semPBO.registrasi(mhs3);
        semPBO.registrasi(mhs4);
        semPBO.registrasi(mhs5);

        // Menampilkan daftar peserta seminar
        System.out.println("Setelah registrasi :");
        semPBO.tampilPeserta();
        System.out.println();

        /* --- PESERTA --- */
        // Menampilkan jumlah total peserta dan jumlah mahasiswa
        System.out.println("Total Peserta Keseluruhan : " + semPBO.countPeserta() + " orang");
        System.out.println("Total Peserta Mahasiswa   : " + semPBO.countMahasiswa() + " orang");
        System.out.println();
    }
}