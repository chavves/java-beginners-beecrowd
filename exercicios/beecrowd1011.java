import java.util.Scanner;
import java.util.Locale;

public class beecrowd1011 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double volume;
        final double PI = 3.14159;

        double R = sc.nextDouble();
        volume = (4/3.0) * PI * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        sc.close();

    }
}