import java.util.Locale;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] maior = new int[N];
        int contadorPares = 0;

        for (int i = 0; i < N; i++){
            maior[i] = sc.nextInt();
            if (maior[i] % 2 == 0){
                System.out.println(maior[i]);
                contadorPares++;
            }
        }

        System.out.println(contadorPares);

        sc.close();
    }
}