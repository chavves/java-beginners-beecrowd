import java.util.Locale;
import java.util.Scanner;

public class beecrowd1114 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = 1;

        while (A != 2002) {
            A = sc.nextInt();
            if (A == 2002) {
                System.out.println("Acesso permitido");
            } else {
                System.out.println("Senha Inválida");
            }

        }

        sc.close();
    }
}