import java.util.Locale;
import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] elementos = new double[N];
        double soma= 0;


        for (int i = 0; i < N; i++){
            elementos[i] = sc.nextDouble();
            soma += elementos[i];
        }

        double media = soma / N;

        System.out.println(media);

        for (int i = 0; i < N; i++){
            if (elementos[i] < media){
                System.out.println(elementos[i]);
            }
        }

        sc.close();
    }
}