public class MataKuliah {
    //atribut
    private String idMatkul;
    private String Nama;
    private int SKS;

    //Konstruktor
    public MataKuliah() {
        this.idMatkul = "";
        this.Nama = "";
        this.SKS = 0;
    }

    public MataKuliah(String idMatkul, String Nama, int SKS) {
        this.idMatkul = idMatkul;
        this.Nama = Nama;
        this.SKS = SKS;
    }

    //SELEKTOR
    public String getIdMatkul() {
        return idMatkul;
    }

    public String getNama() {
        return Nama;
    }

    public int getSKS() {
        return SKS;
    }

    //Mutator
    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    public void printMataKuliah() {
        System.out.println("ID Matkul : " + idMatkul + "," + " Nama Matkul : " + Nama + "," + " Jumlah SKS : " + SKS);
    }
    
}
