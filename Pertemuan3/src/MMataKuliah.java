public class MMataKuliah {
    public static void main(String[] args) {
        MataKuliah M1 = new MataKuliah();
        M1.printMataKuliah();

        MataKuliah M2 = new MataKuliah("M13224", "PBO", 3);
        M2.printMataKuliah();

        M1.setIdMatkul("M16518");
        M1.setNama("JARKOM");
        M1.setSKS(3);
        M1.printMataKuliah();

        System.out.println("ID : " + M2.getIdMatkul());
        System.out.println("Nama : " + M2.getNama());
        System.out.println("SKS : " + M2.getSKS());
    }

    
}
