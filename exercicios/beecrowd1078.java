import java.util.Locale;
import java.util.Scanner;

public class beecrowd1078 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int resultado;

        for (int i = 1; i <= 10; i++){
            resultado = N * i;
            System.out.println(i + " x " + N + " = " + resultado);
        }

        sc.close();
    }
}