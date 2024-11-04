import java.util.Locale;
import java.util.Scanner;

public class beecrowd1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        if ( a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double R1 = (-b + Math.sqrt(delta)) / (2 * a);
            double R2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f%nR2 = %.5f%n", R1, R2);
        }

        sc.close();
    }
}