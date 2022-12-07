public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportasi = new TransportasiAir(20, 15000);
        transportasi.informasi();
        transportasi.berlayar();
        transportasi.berlabuh();

        System.out.println(" ");

        Sampan sampan = new Sampan(15, 25000, 2);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(3);

        System.out.println(" ");

        Kapal kapal = new Kapal(30, 10000, "Diesel");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(35);
        kapal.berlabuh();
    }
}
