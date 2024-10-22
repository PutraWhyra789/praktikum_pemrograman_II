import java.util.Scanner;

public class PRAK104_2310817210029_Putra_Whyra_Pratama_S {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String[] tanganAbu = input.nextLine().split(" ");

        System.out.print("Tangan Bagas: ");
        String[] tanganBagas = input.nextLine().split(" ");
        
        int poinAbu = 0;
        int poinBagas = 0;
        
        for (int i = 0; i < 3; i++) {
            if (tanganAbu[i].equals(tanganBagas[i])) {
                continue;
            } else if ((tanganAbu[i].equals("B") && tanganBagas[i].equals("G")) ||
                       (tanganAbu[i].equals("G") && tanganBagas[i].equals("K")) ||
                       (tanganAbu[i].equals("K") && tanganBagas[i].equals("B"))) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }
        
        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
        input.close();
    }
}
