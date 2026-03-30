/* Nama File    : IResize.java
Deskripsi       : Interface untuk kontrak method resize objek
Pembuat         : Dian Berlian Hutasoit
Tanggal         : 26 Maret 2026
LAB             : C1
*/

public interface IResize {
    //menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    //mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    //menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
    
}