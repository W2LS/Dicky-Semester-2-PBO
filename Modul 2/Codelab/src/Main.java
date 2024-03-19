import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>(); // array untuk menyimpan data mahasiswa
        int pilihan;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("===== Menu Mahasiswa =====");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihlah angka (1 - 3) : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    TambahDataMahasiswa(daftarMahasiswa);
                    break;
                case 2:
                    DataMahasiswa(daftarMahasiswa);
                    break;
                case 3:
                    System.out.println("Terima kasih. Sampai jumpa!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }


    public static void TambahDataMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa) {
        Scanner siswa = new Scanner(System.in);
        String nama;
        String nim;
        String prodi;

        System.out.print("Masukan Nama Mahasiswa : ");
        nama = siswa.nextLine();
        do {

            System.out.print("Masukan NIM Minimal : ");
            nim = siswa.nextLine();


        } while (nim.length()!= 15);

        System.out.print("Masukan Prodi : ");
        prodi = siswa.nextLine();

        Mahasiswa mahasiswaBaru = new Mahasiswa(nama, nim, prodi); // membuat objek mahasiswa baru
        daftarMahasiswa.add(mahasiswaBaru); // menambahkan mahasiswa baru ke dalam array
    }




    public static void DataMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa) {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            System.out.println("Nama\tNIM\tProdi");
            for (Mahasiswa mahasiswa : daftarMahasiswa) {
                System.out.println(mahasiswa.nama + "\t" + mahasiswa.nim + "\t" + mahasiswa.prodi);
            }
        }
    }
}


class Mahasiswa {
    String nama;
    String nim;
    String prodi;

    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

}