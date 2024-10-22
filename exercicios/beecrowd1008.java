import java.util.Scanner;
import java.util.Locale;

public class beecrowd1008 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFuncionario, numHoras;
        double valor, salario;

        numFuncionario = sc.nextInt();
        numHoras = sc.nextInt();
        valor = sc.nextDouble();

        salario = numHoras * valor;

        System.out.println("NUMBER = "+ numFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();

    }
}
