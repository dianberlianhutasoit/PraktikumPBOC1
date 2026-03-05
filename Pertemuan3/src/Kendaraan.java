public class Kendaraan {
    //atribut
    private String noPlat;
    private String jenis;

    //Konstruktor
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //SELEKTOR
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    //MUTATOR
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void printKendaraan() {
        System.out.println("Kendaraan = " + " No.Plat : " + noPlat + " Jenis : " + jenis);
    }
}
