package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class soal2 {
    public static void isiNamaBulan(HashMap<Integer, String> namaBulan) {
        String[] bulan = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        for (int i = 0; i < bulan.length; i++) {
            namaBulan.put(i + 1, bulan[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> namaBulan = new HashMap<>();
        LinkedList<Negara> negaraList = new LinkedList<>();
        isiNamaBulan(namaBulan);

        System.out.print("Masukkan jumlah negara: ");
        int jumlahNegara = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahNegara; i++) {
            System.out.println("Masukkan data negara ke-" + (i + 1) + ":");
            System.out.print("Nama negara: ");
            String nama = scanner.nextLine();

            System.out.print("Jenis kepemimpinan (presiden/monarki/perdana menteri): ");
            String jenis = scanner.nextLine();

            System.out.print("Nama pemimpin: ");
            String pemimpin = scanner.nextLine();

            int tanggal = 0, bulan = 0, tahun = 0;
            if (!jenis.equalsIgnoreCase("monarki")) {
                System.out.print("Tanggal kemerdekaan: ");
                tanggal = scanner.nextInt();
                System.out.print("Bulan kemerdekaan (angka): ");
                bulan = scanner.nextInt();
                System.out.print("Tahun kemerdekaan: ");
                tahun = scanner.nextInt();
                scanner.nextLine();
            }
            negaraList.add(new Negara(nama, jenis, pemimpin, tanggal, bulan, tahun));
        }
        for (Negara negara : negaraList) {
            negara.tampilkanDetail(namaBulan);
        }
        scanner.close();
    }
}