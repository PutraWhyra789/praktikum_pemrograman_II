package praktikum4.soal2;

class Kucing extends HewanPeliharaan {
    private String warnaBulu;

    public Kucing(String nama, String ras, String warnaBulu) {
        super(nama, ras);
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}