import java.util.Locale;
import java.util.Scanner;

public class beecrowd1019 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, horas, minutos, segundos;

        N = sc.nextInt();

        horas = N / 3600;
        minutos = (N % 3600) / 60;
        segundos = N % 60;

        System.out.printf("%d:%d:%d", horas, minutos, segundos);

        sc.close();
    }
}