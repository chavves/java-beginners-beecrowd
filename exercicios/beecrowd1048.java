import java.util.Locale;
import java.util.Scanner;

public class beecrowd1048 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        // Variáveis para armazenar o valor do reajuste e o percentual
        double reajuste = 0;
        double novoSalario = 0;
        double percentual = 0;

        // Determina o percentual de reajuste com base no salário
        if (salario <= 400.00) {
            percentual = 15;
            reajuste = salario * percentual / 100;
        } else if (salario <= 800.00) {
            percentual = 12;
            reajuste = salario * percentual / 100;
        } else if (salario <= 1200.00) {
            percentual = 10;
            reajuste = salario * percentual / 100;
        } else if (salario <= 2000.00) {
            percentual = 7;
            reajuste = salario * percentual / 100;
        } else {
            percentual = 4;
            reajuste = salario * percentual / 100;
        }

        // Calcula o novo salário
        novoSalario = salario + reajuste;

        // Imprime o novo salário, o valor do reajuste e o percentual de reajuste
        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %.0f %%\n", percentual);
        sc.close();
    }
}