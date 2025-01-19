import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class matriz2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[] vet = new int[N];

        for (int i = 0; i < N; i++) {
            int soma = 0;
            for (int j = 0; j < N; j++) {
                soma += mat[i][j];
            }
            vet[i] = soma;
            System.out.println(vet[i]);
        }
        sc.close();
    }
}