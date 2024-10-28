import java.util.Locale;
import java.util.Scanner;

public class beecrowd1021 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        double valor = sc.nextDouble();

        // Converte o valor para centavos
        int resto = (int) (valor * 100 + 0.5); // +0.5 para evitar problemas de arredondamento

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidade = resto / (nota * 100); // Calcula a quantidade de notas
            System.out.println(quantidade + " nota(s) de R$ " + nota + ".00");
            resto %= (nota * 100); // Atualiza o valor restante
        }

        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int quantidade = resto / (int) (moeda * 100); // Calcula a quantidade de moedas
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda);
            resto %= (int) (moeda * 100); // Atualiza o valor restante
        }

        sc.close();
    }
}
