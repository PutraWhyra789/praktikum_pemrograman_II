package praktikum4.soal1;

import java.util.Scanner;

public class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan(String nama, String ras) {
        this.nama = nama;
        this.ras = ras;
    }

    public static HewanPeliharaan createInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama hewan peliharaan: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan ras: ");
        String ras = scanner.nextLine();
        scanner.close();

        return new HewanPeliharaan(nama, ras);
    }

    public void display() {
        System.out.println();
        System.out.println("Detail Hewan Peliharaan");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}
