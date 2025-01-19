import java.util.Locale;
import java.util.Scanner;

public class matriz6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[][] mat = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        // SOMA DOS POSITIVOS \\
        double soma = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] > 0) {
                    soma += mat[i][j];
                }
            }
        }
        System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);


        // ÍNDICE DE UMA LINHA DA MATRIZ \\
        int linha = sc.nextInt();
        System.out.print("LINHA ESCOLHIDA: ");
        for (int j = 0; j < N; j++) {
            System.out.printf("%.1f ", mat[linha][j]);
        }
        System.out.println();

        // ÍNDICE DE UMA COLUNA DA MATRIZ \\
        int coluna = sc.nextInt();
        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < N; i++) {
            System.out.printf("%.1f ", mat[i][coluna]);
        }
        System.out.println();

        // ELEMENTOS DA DIAGONAL PRINCIPAL \\
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < N; i++) {
            System.out.printf("%.1f ", mat[i][i]);
        }
        System.out.println();

        // ALTERAR MATRIZ ELEVANDO AO QUADRADO \\
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] < 0) {
                    mat[i][j] = Math.pow(mat[i][j], 2);
                }
            }
        }
        System.out.println("MATRIZ ALTERADA:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%.1f ", mat[i][j]);
            }
            System.out.println();
        }


        sc.close();
    }
}





