package soal1;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        LinkedList<Dadu> daduList = new LinkedList<>();

        System.out.print("Masukkan jumlah dadu: ");
        int jumlahDadu = scanner.nextInt();

        int totalNilai = 0;
        for (int i = 1; i <= jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            dadu.acakNilai(random);
            daduList.add(dadu);
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.getNilai());
            totalNilai += dadu.getNilai();
        }
        System.out.println("Total nilai dadu keseluruhan: " + totalNilai);
        scanner.close();
    }
}