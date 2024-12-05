import java.util.Locale;
import java.util.Scanner;

public class beecrowd1153 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 1;

        for (int i = 1; i <= N; i++) {
            soma *= i;

        }
        System.out.println(soma);
        sc.close();
    }
}
