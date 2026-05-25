/* Nama File    : Person.java
Deskripsi       : Kelas model Person untuk objek terserialisasi
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 8 Mei 2026
LAB             : C1
*/

import java.io.Serializable;

public class SerializePerson implements Serializable {
    /* --- ATRIBUT --- */
    private String name;

    /* --- METHOD --- */
    
    /* KONSTRUKTOR */
    // Konstruktor dengan parameter nama
    public SerializePerson(String n) {
        this.name = n;
    }

    /* SELEKTOR */
    // Mengembalikan nama person
    public String getName() {
        return this.name;
    }
}