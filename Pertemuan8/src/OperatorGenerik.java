/* Nama File    : OperatorGenerik.java
Deskripsi       : Berisi prosedur dan fungsi generik untuk operasi data
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 7 Mei 2026
LAB             : C1
*/

public class OperatorGenerik {
    
    /* --- METHOD --- */

    /* METHOD LAIN */
    // Menukar isi dari dua objek Datum dengan tipe data yang sama.
    public <T> void Tukar(Datum<T> a, Datum<T> b){
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    // Menghitung total bobot dari dua objek keluarga Kucing.
    public static <T> double Bobot2(Kucing k1, Kucing k2){
        return k1.getBobot() + k2.getBobot();
    }
}