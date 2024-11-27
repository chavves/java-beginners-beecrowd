import java.util.Locale;
import java.util.Scanner;

public class beecrowd1159 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        while (X != 0) {
            if (X % 2 == 0) {
                X = 5 * X + 20;
                System.out.println(X);
            } else {
                X = 5 * X + 25;
                System.out.println(X);
            }

            X = sc.nextInt();

        }

        sc.close();
    }
}