import java.util.Locale;
import java.util.Scanner;

public class beecrowd1154 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cont = 0, soma = 0;

        while (true) {
            int idade = sc.nextInt();
            if (idade > 0) {
                soma += idade;
                cont += 1;
            } else {
                break;
            }
        }

        double media = (double) soma / cont;

        System.out.printf("%.2f%n", media);

    }
}