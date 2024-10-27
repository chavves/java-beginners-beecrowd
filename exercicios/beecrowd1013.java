import java.util.Locale;
import java.util.Scanner;

public class beecrowd1013 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int maiorAB = (A + B + Math.abs(A - B)) / 2;

        int resultado = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.println(resultado + " eh o maior");

        sc.close();

    }
}