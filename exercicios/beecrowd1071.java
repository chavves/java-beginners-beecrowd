import java.util.Locale;
import java.util.Scanner;

public class beecrowd1071 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int min, max;

        if (X < Y) {
            min = X;
            max = Y;
        } else {
            min = Y;
            max = X;
        }

        int soma = 0;
        for (int i = min + 1; i < max; i++){
            if (i % 2 != 0){
                soma += i;
            }
        }

        System.out.println(soma);
        sc.close();
    }
}