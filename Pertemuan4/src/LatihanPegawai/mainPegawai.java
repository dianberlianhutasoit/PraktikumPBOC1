package LatihanPegawai;
/* Nama File    : main.java
Deskripsi       : Berisi driver untuk menguji method yang ada pada seluruh class Pegawai
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 12 Maret 2026
LAB             : C1
*/

import java.time.LocalDate;

public class mainPegawai {
    public static void main(String[] args) {
        
        System.out.println("TES CLASS PEGAWAI");
        Pegawai P1 = new Pegawai();
        P1.printInfoPegawai();
        System.out.println();

        Pegawai P2 = new Pegawai("12345", "Dian", LocalDate.of(2005, 5, 20), LocalDate.of(2023, 1, 1), 3000000.0);
        P2.printInfoPegawai();
        System.out.println();
        
        System.out.println("NIP dari P2 adalah " + P2.getNIP());
        System.out.println("Nama dari P2 adalah " + P2.getNama());
        System.out.println("Gaji Pokok P2 adalah " + P2.formatRupiah(P2.getGajiPokok()));
        System.out.println();

        P1.setNIP("54321");
        P1.setNama("Budi");
        P1.setTanggalLahir(LocalDate.of(2000, 10, 10));
        P1.setTMT(LocalDate.of(2024, 2, 1));
        P1.setGajiPokok(2500000.0);
        System.out.println("Nama P1 setelah diubah adalah " + P1.getNama());
        System.out.println();
        
        P1.printInfoPegawai();
        System.out.println();
        /* *************************************** */

        System.out.println("TES CLASS DOSEN");
        Dosen D1 = new Dosen();
        D1.PrintInfoDosen();
        System.out.println();

        Dosen D2 = new Dosen("11111", "Tono", LocalDate.of(1988, 3, 12), LocalDate.of(2018, 5, 1), 4000000.0, "Kedokteran");
        System.out.println("Fakultas dari D2 adalah " + D2.getFakultas());
        System.out.println();

        D1.setFakultas("Hukum");
        D1.setNama("Sinta");
        D1.PrintInfoDosen();
        System.out.println();
        /* *************************************** */

        System.out.println("TES CLASS DOSEN TETAP");
        Pegawai DT1 = new DosenTetap();
        ((DosenTetap)(DT1)).printInfoPegawai();
        System.out.println();

        Pegawai DT2 = new DosenTetap("9545647548", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000.0, "Sains dan Matematika", "78647324");
        ((DosenTetap)(DT2)).printInfoPegawai();
        System.out.println();

        System.out.println("NIDN Dosen Tetap DT2 adalah " + ((DosenTetap)(DT2)).getNIDN());
        System.out.println("Tanggal Pensiun DT2 adalah " + ((DosenTetap)(DT2)).formatTanggal(((DosenTetap)(DT2)).getTanggalPensiun()));
        System.out.println();

        ((DosenTetap)(DT1)).setNIDN("11223344");
        ((DosenTetap)(DT1)).setFakultas("Ilmu Komputer");
        ((DosenTetap)(DT1)).setNama("Rina");
        ((DosenTetap)(DT1)).printInfoPegawai();
        System.out.println();
        /* *************************************** */

        System.out.println("TES CLASS DOSEN TAMU");
        Pegawai DM1 = new DosenTamu();
        ((DosenTamu)(DM1)).printInfoPegawai();
        System.out.println();

        Pegawai DM2 = new DosenTamu("1234567890", "Joko", LocalDate.of(1985, 8, 15), LocalDate.of(2020, 2, 1), 4000000.0, "Teknik", "99887766", LocalDate.of(2026, 12, 31));
        ((DosenTamu)(DM2)).printInfoPegawai();
        System.out.println();

        System.out.println("NIDK Dosen Tamu DM2 adalah " + ((DosenTamu)(DM2)).getNIDK());
        System.out.println("Sisa Kontrak DM2 adalah " + ((DosenTamu)(DM2)).getSisaKontrakBulan() + " bulan");
        System.out.println();

        ((DosenTamu)(DM1)).setNIDK("55667788");
        ((DosenTamu)(DM1)).setTglBerakhirKontrak(LocalDate.of(2028, 1, 1));
        ((DosenTamu)(DM1)).printInfoPegawai();
        System.out.println();
        /* *************************************** */

        System.out.println("TES CLASS TENDIK");
        Pegawai T1 = new Tendik();
        ((Tendik)(T1)).printInfoPegawai();
        System.out.println();

        Pegawai T2 = new Tendik("0987654321", "Citra", LocalDate.of(1980, 10, 10), LocalDate.of(2010, 3, 1), 3500000.0, "Akademik");
        ((Tendik)(T2)).printInfoPegawai();
        System.out.println();

        System.out.println("Bidang Tendik T2 adalah " + ((Tendik)(T2)).getBidang());
        System.out.println("Tanggal Pensiun T2 adalah " + ((Tendik)(T2)).formatTanggal(((Tendik)(T2)).getTanggalPensiun()));
        System.out.println();

        ((Tendik)(T1)).setBidang("Kemahasiswaan");
        ((Tendik)(T1)).setNama("Ayu");
        ((Tendik)(T1)).printInfoPegawai();
        System.out.println();

    }
}