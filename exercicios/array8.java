import java.util.Locale;
import java.util.Scanner;

public class array8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] altura = new double[N];
        char[] sexo = new char[N];

        for (int i = 0; i < N; i++){
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }

        double menorAltura = altura[0];
        for (int i = 0; i < N; i++){
            if (altura[i] < menorAltura){
                menorAltura = altura[i];
            }
        }

        System.out.printf("Menor altura = %.2f%n", menorAltura);

        double maiorAltura = altura[0];
        for (int i = 0; i < N; i++){
            if (altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
        }

        double somaAlturas = 0.0;
        int contMulheres = 0;
        for (int i = 0; i < N; i++) {
            if (sexo[i] == 'F') {
                somaAlturas += altura[i];
                contMulheres++;
            }
        }

        if (contMulheres == 0) {
            System.out.println("Nao ha nenhuma mulher dentre as pessoas");
        }
        else {
            double media = somaAlturas / contMulheres;
            System.out.printf("Media das alturas das mulheres = %.2f%n", media);
        }

        int contHomens = 0;
        for (int i = 0; i < N; i++) {
            if (sexo[i] == 'M') {
                contHomens++;
            }
        }
        System.out.println("Numero de homens = " + contHomens);

        sc.close();
    }
}