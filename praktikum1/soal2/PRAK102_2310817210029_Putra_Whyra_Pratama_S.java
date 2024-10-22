import java.util.Scanner;

public class PRAK102_2310817210029_Putra_Whyra_Pratama_S {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angkaUser = input.nextInt();

        int hitung = 0;

        while (hitung < 11) {
            if (angkaUser % 5 == 0 && hitung < 10) {
                System.out.print((angkaUser / 5 - 1) + ",");
            } else if (angkaUser % 5 == 0 && hitung == 10) {
                System.out.print((angkaUser / 5 - 1));
            } else if (hitung < 10) {
                System.out.print(angkaUser + ",");
            } else {
                System.out.print(angkaUser);
            }
            angkaUser++;
            hitung++;
        }
        input.close();
    }
}
