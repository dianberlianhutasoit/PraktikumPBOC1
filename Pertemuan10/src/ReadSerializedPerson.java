/* Nama File    : ReadSerializedPerson.java
Deskripsi       : Program untuk membaca objek Person yang telah terserialisasi
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 8 Mei 2026
LAB             : C1
*/

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        // Inisialisasi wadah objek Person
        Person person = null;

        // Uji membaca objek dari file 
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            
            // Membaca biner dan mengonversi kembali ke kelas Person
            person = (Person) s.readObject();
            s.close();
            
            System.out.println("serialized person name " + person.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}