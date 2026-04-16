/* Nama File    : ExceptionArray.java
Deskripsi       : Program penggunaan eksepsi menggunakan class library Java
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 14 April 2026
LAB             : C1
*/

public class ExceptionOnArray {
    /**
     * Menjalankan contoh akses array dan menunjukkan
     * penanganan exception ketika indeks melebihi batas array.
     */
    public static void main(String[] args) {
        // instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } 
        
        catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } 
        
        finally {
            System.out.println("clean up code...");
        }
    }
}
