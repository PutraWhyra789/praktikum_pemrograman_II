package praktikum2.soal1;

public class Soal1Main {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 0.4, 7000, 40.0);
        apel.info();

        Buah mangga = new Buah("Mangga", 0.2, 3500, 15.0);
        mangga.info();

        Buah alpukat = new Buah("Alpukat", 0.25, 10000, 12.0);
        alpukat.info();
    }
}
