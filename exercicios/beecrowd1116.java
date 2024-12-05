import java.util.Locale;
import java.util.Scanner;

public class beecrowd1116 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++){
            int Y = sc.nextInt();
            int X = sc.nextInt();

            if (X == 0){
                System.out.println("divisao impossivel");
            } else {
                double media = (double) Y / X;
                System.out.printf("%.1f%n", media);
            }
        }

        sc.close();

    }
}