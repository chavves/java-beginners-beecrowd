import java.util.Locale;
import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vetA = new int[N];
        int[] vetB = new int[N];
        int soma = 0;

        for (int i = 0; i < N; i++){
            vetA[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++){
            vetB[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++){
            System.out.print(vetA[i] + vetB[i] + " ");
        }

        sc.close();
    }
}