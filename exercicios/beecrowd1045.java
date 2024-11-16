import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class beecrowd1045 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Lê os três lados do triângulo
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Ordena os lados em ordem crescente
        double[] lados = {A, B, C};
        Arrays.sort(lados);

        // Após a ordenação, o maior valor estará em lados[2], o intermediário em lados[1], e o menor em lados[0]
        A = lados[2];
        B = lados[1];
        C = lados[0];

        // Verifica se os lados podem formar um triângulo

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && A == C && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        sc.close();
    }
}