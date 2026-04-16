/* Nama File    : Asersi2.java
Deskripsi       : Program untuk demo asersi, yang akan menolak input
                  jari-jari lingkaran yang bernilai nol
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 14 April 2026
LAB             : C1
*/

// Class Lingkaran
class Lingkaran {
    private double jariJari;

    /**
     * Menginisialisasi objek Lingkaran dengan nilai jari-jari tertentu.
     */
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    /**
     * Menghitung dan mengembalikan nilai keliling lingkaran
     * berdasarkan rumus 2 x pi x jari-jari.
     */
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// Class Asersi2
public class Asersi2 {
    /**
     * Menjalankan contoh penggunaan assert untuk memastikan
     * jari-jari lingkaran bernilai lebih besar dari nol.
     */
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0): "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}