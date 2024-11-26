package soal1;

import java.util.Random;

public class Dadu {
    private int nilai;

    public void acakNilai(Random random) {
        this.nilai = random.nextInt(6) + 1;
    }

    public int getNilai() {
        return nilai;
    }
}