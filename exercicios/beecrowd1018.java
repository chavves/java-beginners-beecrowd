import java.util.Locale;
import java.util.Scanner;

public class beecrowd1018 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] valor = {100, 50, 20, 10, 5, 2, 1};

        int N = sc.nextInt();
        System.out.println(N);

        for (int valores : valor){
            int quantidade = N / valores;
            System.out.println(quantidade + " nota(s) de R$ " + valores + ",00");
            N %= valores;
        }

        sc.close();
    }
}