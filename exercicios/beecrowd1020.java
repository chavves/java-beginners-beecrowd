import java.util.Locale;
import java.util.Scanner;

public class beecrowd1020 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Lê a idade em dias
        int dias = sc.nextInt();

        // Calcula anos, meses e dias
        int ano = dias / 365;
        int mes = (dias % 365) / 30;
        int dia = (dias % 365) % 30;

        // Imprime o resultado, garantindo que cada parte esteja em uma nova linha
        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", dia);

        sc.close();
    }
}
