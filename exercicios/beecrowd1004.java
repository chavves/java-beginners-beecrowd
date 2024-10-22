import java.util.Scanner;
import java.util.Locale;

public class beecrowd1004 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        A = sc.nextInt();
        B = sc.nextInt();

        PROD = A * B;

        System.out.println("PROD = "+ PROD);

        sc.close();
    }
}
