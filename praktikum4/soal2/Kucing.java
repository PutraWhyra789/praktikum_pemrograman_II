package praktikum4.soal2;

// Subclass untuk Kucing
class Kucing extends HewanPeliharaan {
    private String warnaBulu;

    // Konstruktor
    public Kucing(String nama, String ras, String warnaBulu) {
        super(nama, ras);
        this.warnaBulu = warnaBulu;
    }

    // Override display method
    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}