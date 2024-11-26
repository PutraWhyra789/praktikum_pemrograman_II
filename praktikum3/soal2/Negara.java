package soal2;

import java.util.HashMap;

public class Negara {
    private String nama, jenisKepemimpinan, namaPemimpin;
    private int tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }
    public String capitalizedKepemimpinan(String jenisKepemimpinan) {
        if (jenisKepemimpinan.equalsIgnoreCase("perdana menteri")) {
            return "Perdana Menteri";
        } else {
            return jenisKepemimpinan.substring(0, 1).toUpperCase() + jenisKepemimpinan.substring(1);
        }
    }

    public void tampilkanDetail(HashMap<Integer, String> namaBulan) {
        System.out.println();
        System.out.println("Negara " + nama + " mempunyai " + capitalizedKepemimpinan(jenisKepemimpinan) + " bernama " + namaPemimpin);
        if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " "
                    + namaBulan.get(bulanKemerdekaan) + " " + tahunKemerdekaan);
        }
    }
}