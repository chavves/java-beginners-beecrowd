import java.util.Locale;
import java.util.Scanner;

public class beecrowd1117 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2;

        while (true) {
            nota1 = sc.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("nota invalida");
            } else {
                break;
            }
        }

        while (true) {
            nota2 = sc.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("nota invalida");
            } else {
                break;
            }
        }

        double media = (nota1 + nota2) / 2;
        System.out.printf("media = %.2f%n", media);

        sc.close();
    }

}
