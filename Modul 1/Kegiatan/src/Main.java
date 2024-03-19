import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilihan;
        Scanner input = new Scanner(System.in);

        while (true) { // menggantikan 1 dengan true untuk mengulangi loop selamanya
            System.out.println("===== Sistem Perpustakaan =====");
            System.out.println("1. Login Siswa");
            System.out.println("2. Login Guru");
            System.out.println("3. Keluar");
            System.out.print("Pilihlah angka (1 - 3) : ");
            pilihan = input.nextInt();

            switch (pilihan) { // menggantikan if-else dengan switch case
                case 1:
                    loginSiswa();
                    break;
                case 2:
                    loginGuru();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan. Sampai jumpa!");
                    System.exit(0); // menghentikan program
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }

    public static void loginSiswa() {
        //untuk login siswa berdasarkan NIM
        Scanner siswa = new Scanner(System.in);
        String NIM = "202310370311110";
        String inputNIM;

        System.out.print("Masukan NIM : ");
        inputNIM = siswa.nextLine();

        if (inputNIM.equals(NIM)) {
            System.out.println("NIM anda terdaftar");
        } else {
            System.out.println("NIM anda tidak terdaftar");
        }
    }

    public static void loginGuru() {
        //login gurup
        Scanner guru = new Scanner(System.in);
        String password = "admin";
        String pass;
        String username = "dicky";
        String user;

        System.out.print("Masukan Username : ");
        user = guru.nextLine();

        System.out.print("Masukan Password : ");
        pass = guru.nextLine();

        if (user.equals(username) && pass.equals(password)) {
            System.out.println("Login Berhasil");
        } else if (user.equals(username) && !pass.equals(password)) {
            System.out.println("Username Benar, Password salah");
        }else if (!user.equals(username) && pass.equals(password)){
            System.out.println("Username Salah, Password Benar");
        }else if (!user.equals(username) && !pass.equals(password)){
            System.out.println("Username Salah, Password Salah");
        }


    }

}
