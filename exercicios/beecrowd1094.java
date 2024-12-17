import java.util.Scanner;
import java.util.Locale;

public class beecrowd1094 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int teste = sc.nextInt();
        int coelho = 0, rato = 0, sapo = 0;

        for (int i = 0; i < teste; i++){
            int cobaia1 = sc.nextInt();
            char cobaia = sc.next().charAt(0);
            if (cobaia == 'C'){
                coelho += cobaia1;
            } else if (cobaia == 'R') {
                rato += cobaia1;
            } else if (cobaia == 'S') {
                sapo += cobaia1;
            }
            else {
                System.out.println("Cobaia inválido!");
            }
        }

        int total = rato + coelho + sapo;
        double porcCoelho = (double) coelho / total * 100;
        double porcRato = (double) rato / total * 100;
        double porcSapo = (double) sapo / total * 100;

        System.out.println("Total: "+ total +" cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.printf("Percentual de coelhos: %.2f %%\n", porcCoelho);
        System.out.printf("Percentual de ratos: %.2f %%\n", porcRato);
        System.out.printf("Percentual de sapos: %.2f %%\n", porcSapo);


        sc.close();
    }
}
