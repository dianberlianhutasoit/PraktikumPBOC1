/* Nama File    : DAOManager.java
Deskripsi       : Pengelola DAO dalam program
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 8 Mei 2026
LAB             : C1
*/

public class DAOManager {
    /* --- ATRIBUT --- */
    private PersonDAO personDAO;

    /* --- METHOD --- */
    
    /* MUTATOR */
    // Mengeset atau mengatur objek DAO yang akan digunakan
    public void setPersonDAO(PersonDAO person) {
        this.personDAO = person;
    }

    /* SELEKTOR */
    // Mengembalikan objek DAO yang sedang aktif
    public PersonDAO getPersonDAO() {
        return this.personDAO;
    }
}