package praktikum6.PRAKTIKUM6;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class praktikum6Main {
    public static void main(String[] args) {
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add(new Mahasiswa(1, "200101001", "Budi Santoso"));
        daftarMahasiswa.add(new Mahasiswa(2, "200101002", "Ani Kartika"));
        daftarMahasiswa.add(new Mahasiswa(3, "200101003", "Citra Maharani"));
        daftarMahasiswa.add(new Mahasiswa(4, "200101004", "Doni Pratama"));
        daftarMahasiswa.add(new Mahasiswa(5, "200101005", "Eka Saputra"));
        daftarMahasiswa.add(new Mahasiswa(6, "200101006", "Fajar Hidayat"));
        daftarMahasiswa.add(new Mahasiswa(7, "200101007", "Gita Amalia"));
        daftarMahasiswa.add(new Mahasiswa(8, "200101008", "Hendra Wijaya"));
        daftarMahasiswa.add(new Mahasiswa(9, "200101009", "Indah Permata"));
        daftarMahasiswa.add(new Mahasiswa(10, "200101010", "Joko Sugiarto"));

        String[] kolom = {"NIM", "Nama"};
        String[][] data = new String[daftarMahasiswa.size()][2];
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            data[i][0] = daftarMahasiswa.get(i).getNim();
            data[i][1] = daftarMahasiswa.get(i).getNama();
        }

        JFrame frame = new JFrame("Daftar Mahasiswa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTable table = new JTable(data, kolom);
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}