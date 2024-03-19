public class App {
    public static void main(String[] args) throws Exception {
        Tabung tabung = new Tabung("tabung");
        Kubus kubus = new Kubus("Balok");


        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
    }
    //BY : DICKY AKBAR SYAH PUTRA 110
}
