import java.util.Locale;
import java.util.Scanner;

public class beecrowd1131 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcao = 1, golInter, golGremio, empate = 0;
        int Grenal = 0, contGre = 0, contInt = 0;


        while (opcao == 1) {
            golInter = sc.nextInt();
            golGremio = sc.nextInt();
            if (golInter > golGremio) {
                contInt += 1;
                Grenal += 1;
            } else if (golGremio > golInter) {
                contGre += 1;
                Grenal += 1;
            } else {
                empate += 1;
                Grenal += 1;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = sc.nextInt();

        }

        System.out.println(Grenal + " grenais");
        System.out.println("Inter:" + contInt);
        System.out.println("Gremio:" + contGre);
        System.out.println("Empates:" + empate);
        if (contInt > contGre) {
            System.out.println("Inter venceu mais");
        } else if (contGre > contInt) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

        sc.close();
    }
}