import java.util.Scanner;

public class beecrowd1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 100;
        int[] X = new int[N];

        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }

        int maiorValor = X[0];
        int posicao = 0;

        for (int i = 1; i < N; i++) {
            if (X[i] > maiorValor) {
                maiorValor = X[i];
                posicao = i;
            }
        }


        System.out.println(maiorValor);
        System.out.println(posicao + 1); //

        sc.close();
    }
}
