/* Nama File    : AngkaSial.java
Deskripsi       : Program penggunaan exception buatan sendiri
                  Pengenalan klausa 'throw' dan 'throws'
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 14 April 2026
LAB             : C1
*/

public class AngkaSial {
    /**
     * Mengecek apakah angka yang diberikan termasuk angka sial.
     * Jika angka bernilai 13, method akan melempar exception buatan sendiri.
     */
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    /**
     * Menjalankan contoh pemanggilan method cobaAngka()
     * dan menangani exception jika angka sial dimasukkan.
     */
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } 
        
        catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka!!!");
        }
    }
}
