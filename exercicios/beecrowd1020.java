import java.util.Locale;
import java.util.Scanner;

public class beecrowd1020 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int dias = sc.nextInt();

        int ano = dias / 365;
        int mes = (dias % 365) / 30;
        int dia = (dias % 365) % 30;

        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", dia);

        sc.close();
    }
}
