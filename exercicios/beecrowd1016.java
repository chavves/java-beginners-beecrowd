import java.util.Locale;
import java.util.Scanner;

public class beecrowd1016 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double distancia = sc.nextDouble();

        double resultado = distancia * 2;


        System.out.println(distancia + " minutos");

        sc.close();
    }
}