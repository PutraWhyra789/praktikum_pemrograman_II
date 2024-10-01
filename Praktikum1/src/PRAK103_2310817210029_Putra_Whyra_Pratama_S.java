import java.util.Scanner;

public class PRAK103_2310817210029_Putra_Whyra_Pratama_S {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int angkaPertama = input.nextInt();
        
        int hitung = 0;
        int number = angkaPertama;
        
        do {
            if (number % 2 != 0) {
                System.out.print(number);
                hitung++;
                if (hitung < N) {
                    System.out.print(", ");
                }
            }
            number++;
        } while (hitung < N);
        
        input.close();
    }
}
