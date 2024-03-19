import java.util.Scanner;

class Kubus extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    private double sisi;


    Kubus(String name) {
        super(name);
    }

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Input sisi: ");
        sisi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan(){
        super.luasPermukaan();
        double hasil = 6 * sisi * sisi;
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume(){
        super.volume();
        double hasil = sisi * sisi * sisi;
        System.out.println("Hasil volume: " + hasil);
        System.out.println("");
    }

    //BY : DICKY AKBAR SYAH PUTRA 110
}
