import java.util.Locale;
import java.util.Scanner;

public class array9 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] mercadoria = new String[N];
        double[] precoCompra = new double[N];
        double[] precoVenda = new double[N];

        for (int i = 0; i < N; i++) {
            mercadoria[i] = sc.next();
            precoCompra[i] = sc.nextDouble();
            precoVenda[i] = sc.nextDouble();
        }
        int contLucroAbaixo = 0;
        int contLucroEntre = 0;
        int contLucroAcima = 0;

        for (int i = 0; i < N; i++) {
            double lucroAbsoluto = precoVenda[i] - precoCompra[i];
            double lucroPercentual = (lucroAbsoluto / precoCompra[i]) * 100;

            if (lucroPercentual < 10.0) {
                contLucroAbaixo++;
            }
            else if (lucroPercentual <= 20.0){
                contLucroEntre++;
            }
            else {
                contLucroAcima++;
            }
        }
        double calculoCompras = 0;
        double calculoVendas = 0;

        for ( int i = 0; i < N; i++){
            calculoCompras += precoCompra[i];
            calculoVendas += precoVenda[i];
        }

        double lucroTotal = calculoVendas - calculoCompras;

        System.out.println("Lucro abaixo de 10%: " + contLucroAbaixo);
        System.out.println("Lucro entre 10% e 20%: " + contLucroEntre);
        System.out.println("Lucro acima de 20%: " + contLucroAcima);
        System.out.printf("Valor total de compra: %.2f%n", calculoCompras);
        System.out.printf("Valor total de venda: %.2f%n", calculoVendas);
        System.out.printf("Lucro total: %.2f%n", lucroTotal);


        sc.close();
    }
}