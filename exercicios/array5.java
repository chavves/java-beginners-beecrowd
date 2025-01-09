import java.util.Locale;
import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vetor = new int[N];
        int soma = 0, contador = 0;

        for (int i = 0; i < N; i++){
            vetor[i] = sc.nextInt();

            if (vetor[i] % 2 == 0){
                soma += vetor[i];
                contador++;
            }
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.printf("%.2f", media);
        } else {
            System.out.println("Nenhum número par encontrado.");
        }

        sc.close();

    }
}