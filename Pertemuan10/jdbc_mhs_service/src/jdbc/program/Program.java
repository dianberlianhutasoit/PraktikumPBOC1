/* Nama File    : Program.java
Deskripsi       : Driver program untuk menguji kelas MysqlMahasiswaService
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 8 Mei 2026
LAB             : C1
*/

package jdbc.program;

import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        System.out.println("");

        // Uji insert
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        System.out.println("");

        // Uji update
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        if (mhsUpdate != null) {
            System.out.println("Akan diupdate data lama: " + mhsUpdate);
            mhsUpdate.setNama("Dinaya");
            System.out.println("dengan data baru: " + mhsUpdate);
            service.update(mhsUpdate);
        }
        displayAll();

        System.out.println("");

        // Uji delete
        System.out.println("===delete");
        Mahasiswa mhsDelete = service.getById(5);
        if (mhsDelete != null) {
            System.out.println("akan di delete: " + mhsDelete);
            service.delete(5);
        }
        displayAll();
    }

    /* --- METHOD TAMBAHAN --- */
    
    // Mencetak semua data mahasiswa ke terminal
    public static void displayAll() {
        System.out.println("===displayAll");
        List<Mahasiswa> listMhs = service.getAll();
        for (Mahasiswa m : listMhs) {
            System.out.println(m);
        }
    }
}