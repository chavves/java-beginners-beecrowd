import java.util.Locale;
import java.util.Scanner;

public class beecrowd1134 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numProduto;
        int A = 0, D = 0, G = 0;
        String abastecimento;

        while (true) {
            numProduto = sc.nextInt();

            switch (numProduto) {
                case 1:
                    A += 1;
                    break;
                case 2:
                    G += 1;
                    break;
                case 3:
                    D += 1;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO");
                    System.out.println("Alcool: " + A);
                    System.out.println("Gasolina: " + G);
                    System.out.println("Diesel: " + D);
                    sc.close();
                    return;
                default:
                    break;
            }
        }
    }
}
