package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = scanner.nextLine();
                    mahasiswaList.add(new Mahasiswa(nama, nim));
                    System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = scanner.nextLine();
                    mahasiswaList.removeIf(mahasiswa -> mahasiswa.getNim().equals(nimHapus));
                    System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String nimCari = scanner.nextLine();
                    boolean ditemukan = false;
                    for (Mahasiswa mahasiswa : mahasiswaList) {
                        if (mahasiswa.getNim().equals(nimCari)) {
                            System.out.println("Mahasiswa ditemukan: Nama: " + mahasiswa.getNama() + ", NIM: " + mahasiswa.getNim());
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mahasiswa : mahasiswaList) {
                        System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
                    }
                    break;

                case 0:
                    mahasiswaList.clear();
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 0);
    scanner.close();
    }
}