import java.util.Locale;
import java.util.Scanner;

public class beecrowd1101 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);




        while (true){
            int M = sc.nextInt();
            int N = sc.nextInt();

            int menor = Math.min(M, N);
            int maior = Math.max(M, N);

            if (M <= 0 || N <= 0){
                break;
            }

            int soma = 0;
            StringBuilder resultado = new StringBuilder();

            for (int i = menor; i <= maior; i++){
                resultado.append(i);
                soma += i;

                if (i < maior){
                    resultado.append(" ");
                }
            }

            System.out.println(resultado +" Sum="+ soma);

        }

        sc.close();
    }
}