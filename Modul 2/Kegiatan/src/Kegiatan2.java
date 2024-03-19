import java.util.Scanner;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

//PR nya tinggal bagaimana cara menampilakan buku yang di pinjamnya dan buku tersebut setelah di pinjam akan berkurang stocknya

public class Kegiatan2 {
    static final int MAX_SISWA = 100; // Max jumlah siswa
    static ArrayList<String> namaSiswa = new ArrayList<>();
    static ArrayList<String> nimSiswa = new ArrayList<>();
    static ArrayList<String> jurusanSiswa = new ArrayList<>();
    static ArrayList<String> fakultasSiswa = new ArrayList<>();
    static ArrayList<String> bukuDipinjam = new ArrayList<>();
    static String adminNIM; // Menyimpan NIM siswa yang login sebagai admin


    static int jumlahSiswa = 0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int pilihan;

        while (true){
            System.out.println("Menu Login Library");
            System.out.println("1. Login admin");
            System.out.println("2. Login Siswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih angka (1 - 3) : ");
            pilihan = input.nextInt();
            switch (pilihan){
                case 1:
                    Ladmin();
                    break;

                case 2:
                    Lsiswa(adminNIM);
                    break;

                case 3:
                    System.out.println("Terimakasih");
                    break;
            }if (pilihan == 3){
                break;
            }


        }

    }



    public static void Ladmin(){
        Scanner in = new Scanner(System.in);
        String user = "admin";
        String pass = "admin";
        String userInputPassword;
        String userInputUsername;

        System.out.print("Masukan Username : ");
        userInputUsername = in.nextLine();

        System.out.print("Masukan Password : ");
        userInputPassword = in.nextLine();

        if (userInputUsername.equals(user) && userInputPassword.equals(pass)){
            System.out.println("Login Sucses");
            System.out.println("Sekarang anda berada di menu admin !!");
            while (true){
                Scanner inAdmin = new Scanner(System.in);
                int pilAdmin;
                System.out.println("1. Tambahkan Siswa");
                System.out.println("2. Tampilkan Siswa");
                System.out.println("3. Keluar");
                System.out.print("Pilih angka (1 - 3) : ");
                pilAdmin = inAdmin.nextInt();

                switch (pilAdmin){
                    case 1:
                        Scanner input = new Scanner(System.in);
                        System.out.print("Masukkan Nama: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan NIM (15 karakter): ");
                        String nim = input.nextLine();
                        System.out.print("Masukan Fakultas : ");
                        String fakultas = input.nextLine();
                        System.out.print("Masukkan Jurusan: ");
                        String jurusan = input.nextLine();

                        if (nim.length() != 15) {
                            System.out.println("Panjang NIM harus 15 karakter!");
                            return;
                        }else{
                            namaSiswa.add(nama);
                            nimSiswa.add(nim);
                            jurusanSiswa.add(jurusan);
                            fakultasSiswa.add(fakultas);
                            adminNIM = nim; // Simpan NIM siswa yang baru ditambahkan
                            System.out.println("Siswa berhasil ditambahkan.");
                        }
                        break;

                    case 2:
                        System.out.println("Menampilkan daftar siswa...");
                        for (int i = 0; i < namaSiswa.size(); i++) {
                            System.out.println("Nama: " + namaSiswa.get(i) + ", NIM: " + nimSiswa.get(i) + ", Fakultas: " + fakultasSiswa.get(i) + ", Jurusan: " + jurusanSiswa.get(i));
                        }
                        break;

                    case 3:
                        System.out.println("======== Kembali ke menu awal ========");
                        break;

                }if (pilAdmin == 3){
                    break;
                }


            }
        }else {
            System.out.println("Login Failed");
        }

    }


    public static void Lsiswa(String nim){
        Scanner in = new Scanner(System.in);



        System.out.print("Masukan NIM anda : ");
        String UserInputNim = in.nextLine();

        int siswaIndeks = nimSiswa.indexOf(UserInputNim);

        if (UserInputNim.equals(nim)){
            System.out.println("Login Sucsess");
            System.out.println("Sekarang anda berada di menu siswa");
            System.out.println("Selamat Datang " + namaSiswa.get(siswaIndeks) + " !!!");

            while (true){
                Scanner inSiswa = new Scanner(System.in);
                int PilSiswa;

                System.out.println("==== Selamat datang di menu perpustakaan ====");
                System.out.println("1. Buku Terpinjam");
                System.out.println("2. Pinjam Buku");
                System.out.println("3. Keluar");
                System.out.print("Pilih angka (1 - 3) : ");
                PilSiswa = inSiswa.nextInt();
                System.out.println("");

                switch (PilSiswa){
                    case 1:
                        TampilkanBukuTerpinjam();

                        break;
                    case 2:
                        PinjamBuku();

                        break;
                    case 3:
                        System.out.println("======== Kembali ke menu awal ========");
                        break;

                }if (PilSiswa == 3){
                    break;
                }
            }


        }else {
            System.out.println("Login Gagal");
        }


    }

    public static void PinjamBuku(){
        Scanner input = new Scanner(System.in);

        int Stk1 = 4;
        int Stk2 = 0;
        int Stk3 = 2;

        System.out.println("=================================================================================================");
        System.out.println("||  NO   ||       ID BUKU         ||     NAMA BUKU      ||   AUTOR   ||   CATEGORY   ||  STOCK ||");
        System.out.println("=================================================================================================");
        System.out.printf("||   1   ||    388c-e681-9152     ||       Memasak      ||   author  ||   Sejarah    ||    %d   ||%n", Stk1);
        System.out.printf("||   2   ||    ed90-be30-5cdb     ||       Makanan      ||   author  ||   Sejarah    ||    %d   ||%n", Stk2);
        System.out.printf("||   3   ||    d95e-0c4a-9523     ||       Minuman      ||   author  ||   Sejarah    ||    %d   ||%n", Stk3);
        System.out.println("=================================================================================================");
        System.out.println("");

        System.out.print("Masukkan ID buku yang ingin dipinjam: ");
        String idBukuDipinjam = input.nextLine();

        if(idBukuDipinjam.equals("99")){
            return;
        }


        if(idBukuDipinjam.isEmpty()){
            System.out.println("Mohon masukan id buku yang ingin di pinjam");
        }else {

            System.out.println("Buku Berhasil di pinjam.");
        }
    }


    public static void TampilkanBukuTerpinjam(){
        System.out.println("Buku yang sedang di pinjam : ");
        for (String idBuku : bukuDipinjam){
            System.out.println("ID buku: " + idBuku);
        }
    }


}
