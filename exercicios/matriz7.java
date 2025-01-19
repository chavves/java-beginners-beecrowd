import java.util.Locale;
import java.util.Scanner;

public class matriz7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] pelotao = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                pelotao[i][j] = sc.nextInt();
            }
        }

        int fila = sc.nextInt() - 1;

        int temp = pelotao[fila][N - 1];
        for (int j = N - 1; j > 0; j--) {
            pelotao[fila][j] = pelotao[fila][j - 1];
        }
        pelotao[fila][0] = temp;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(pelotao[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}





