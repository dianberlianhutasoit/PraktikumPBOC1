public class MKendaraan {
    public static void main(String[] args) {
        Kendaraan K1 = new Kendaraan();
        K1.printKendaraan();

        Kendaraan K2 = new Kendaraan("B 7346", "Mobil");
        K2.printKendaraan();
        System.out.println("No.Plat : " + K2.getNoPlat());
        System.out.println("Jenis Kendaraan : " + K2.getJenis());

        K1.setNoPlat("BK 8763");
        K1.setJenis("Motor");
        K1.printKendaraan();

        
    }

    
}
