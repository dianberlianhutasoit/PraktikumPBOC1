package pertemuan10;

public class Pertemuan10 {
    public static void main(String args[]) {
        // 1. Membuat objek model dengan nama data "Indra"
        Person person = new Person("Indra"); 
        
        // 2. Inisialisasi pengelola DAO
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        
        try {
            // 3. Eksekusi penyimpanan objek lewat objek DAO
            m.getPersonDAO().savePerson(person); 
            System.out.println("Proses Berhasil: Objek person disimpan ke database!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menyimpan data:");
            e.printStackTrace();
        }
    }
}