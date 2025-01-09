import java.util.Locale;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] maior = new double[N];
        double maiorNum = 0;
        int posicao = 0;

        for (int i = 0; i < N; i++){
            maior[i] = sc.nextDouble();

            if (maior[i] > maiorNum){
                maiorNum = maior[i];
                posicao = i;
            }
        }

        System.out.println(maiorNum);
        System.out.println(posicao);

        sc.close();
    }
}