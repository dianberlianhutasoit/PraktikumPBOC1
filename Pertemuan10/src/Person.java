/* Nama File    : Person.java
Deskripsi       : Person database model
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 8 Mei 2026
LAB             : C1
*/

import java.io.Serializable;

public class Person implements Serializable {
    /* ATRIBUT */
    private int id;
    private String name;

    /* METHOD */

    /* KONSTRUKTOR */
    public Person(String n) {
        name = n;
    }

    //Konstruktor untuk membuat objek Person
    public Person(int i, String n) {
        id = i;
        name = n;
    }


    /* SELEKTOR */
    public int getId() {
        return id;
    }

    //Mengembalikan nilai n am e
    public String getName() {
        return name;
    }
}