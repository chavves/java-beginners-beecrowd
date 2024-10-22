import java.util.Scanner;
import java.util.Locale;

public class beecrowd1009 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeVendedor;
        double salario, vendas, total, porcentagem;

        nomeVendedor = sc.nextLine();
        salario = sc.nextDouble();
        vendas = sc.nextDouble();

        porcentagem = vendas * 0.15;
        total = porcentagem + salario;

        System.out.printf("TOTAL = R$ %.2f%n", total);

        sc.close();

    }
}