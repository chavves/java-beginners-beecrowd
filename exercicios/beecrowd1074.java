import java.util.Locale;
import java.util.Scanner;

public class beecrowd1074 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X;

        for (int i = 1; i <= N; i++) {
            X = sc.nextInt();
            if (X % 2 == -0 && X < 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (X % 2 == 0 && X != 0) {
                System.out.println("EVEN POSITIVE");
            } else if (X < 0) {
                System.out.println("ODD NEGATIVE");
            } else if (X == 0) {
                System.out.println("NULL");
            } else {
                System.out.println("ODD POSITIVE");
            }
        }

        sc.close();
    }
}