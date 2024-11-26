package praktikum2.soal1;

public class Buah {
    private String namaBuah;
    private double beratPerSatuan;
    private double hargaPerSatuan;
    private double jumlahBeli;

    public Buah(String namaBuah, double beratPerSatuan, double hargaPerSatuan, double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.beratPerSatuan = beratPerSatuan;
        this.hargaPerSatuan = hargaPerSatuan;
        this.jumlahBeli = jumlahBeli;
    }

    public double getHargaSebelumDiskon() {
        return (jumlahBeli / beratPerSatuan) * hargaPerSatuan;
    }

    public double getTotalDiskon() {
        double diskonPer4Kg = 0.02;
        return Math.floor(jumlahBeli / 4) * diskonPer4Kg * hargaPerSatuan * 4;
    }

    public double getHargaSetelahDiskon() {
        return getHargaSebelumDiskon() - getTotalDiskon();
    }

    public void info() {
        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + beratPerSatuan + "kg");
        System.out.println("Harga: Rp" + hargaPerSatuan);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", getHargaSebelumDiskon());
        System.out.printf("Total Diskon: Rp%.2f\n", getTotalDiskon());
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n", getHargaSetelahDiskon());
        System.out.println();
    }
}
