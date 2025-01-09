import java.util.Locale;
import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nome = new String[N];
        int[] idade = new int[N];
        int idadeMaior = 0;
        int indiceMaior = 0;

        for (int i = 0; i < N; i++){
            nome[i] = sc.next();
            idade[i] = sc.nextInt();

            if (idade[i] > idadeMaior){
                idadeMaior = idade[i];
                indiceMaior = i;
            }
        }

        System.out.println("Pessoa mais velha: " + nome[indiceMaior]);

        sc.close();

    }
}