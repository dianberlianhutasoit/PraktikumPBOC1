/* Nama File    : MainDAO.java
Deskripsi       : Main program untuk akses DAO
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 8 Mei 2026
LAB             : C1
*/

public class MainDAO {
    public static void main(String[] args) {
        // Persiapan data objek Person
        Person person = new Person("Indra");
        
        // Inisialisasi DAOManager
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        System.out.println("********************************************************");

        // Uji savePerson
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("********************************************************");
    }
}