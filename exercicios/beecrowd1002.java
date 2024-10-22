import java.util.Scanner;
import java.util.Locale;

public class beecrowd1002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, raio;
        final double PI = 3.14159;  // Definindo o valor de π

        // Lê o valor do raio
        raio = sc.nextDouble();

        // Calcula a área usando a fórmula A = π * raio²
        area = PI * Math.pow(raio, 2);

        // Exibe a área formatada com 4 casas decimais
        System.out.printf("A=%.4f%n", area);  // Saída formatada com nova linha

        // Fecha o scanner
        sc.close();
    }
}
