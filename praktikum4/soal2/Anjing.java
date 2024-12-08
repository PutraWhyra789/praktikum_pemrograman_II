package praktikum4.soal2;

class Anjing extends HewanPeliharaan {
    private String kemampuan;
    private String warnaBulu;

    public Anjing(String nama, String ras, String warnaBulu, String kemampuan) {
        super(nama, ras);
        this.warnaBulu = warnaBulu;
        this.kemampuan = kemampuan;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.println("Memiliki kemampuan : " + kemampuan);
    }
}