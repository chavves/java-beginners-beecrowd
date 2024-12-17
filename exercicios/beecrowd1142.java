import java.util.Locale;
import java.util.Scanner;

public class beecrowd1142 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int contador = 1;


        for (int i = 0; i < num; i++){
            System.out.println(contador + " " + (contador + 1) + " " + (contador + 2) + " PUM");
            contador += 4;
        }

        sc.close();

    }
}
