package praktikum6.PRAKTIKUM6;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class praktikum6Main {
    public static void main(String[] args) {
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add(new Mahasiswa(1, "2310817210001", "Galih CPP"));
        daftarMahasiswa.add(new Mahasiswa(2, "2310817210002", "Dika Tanjung"));
        daftarMahasiswa.add(new Mahasiswa(3, "2310817210003", "Jovan Kamboja"));
        daftarMahasiswa.add(new Mahasiswa(4, "2310817210004", "Hasbi Batu Mandi"));
        daftarMahasiswa.add(new Mahasiswa(5, "2310817210005", "Randy Okarun"));
        daftarMahasiswa.add(new Mahasiswa(6, "2310817210006", "Damar Python"));
        daftarMahasiswa.add(new Mahasiswa(7, "2310817210007", "Daffa Kewer"));
        daftarMahasiswa.add(new Mahasiswa(8, "2310817210008", "Rizky Geo"));
        daftarMahasiswa.add(new Mahasiswa(9, "2310817210009", "Putra Wahyu"));
        daftarMahasiswa.add(new Mahasiswa(10, "2310817210010", "Yudi Tekken"));

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