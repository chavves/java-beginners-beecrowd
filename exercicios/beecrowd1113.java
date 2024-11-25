import java.util.Locale;
import java.util.Scanner;

public class beecrowd1113 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        while (X != Y){
            if (X < Y){
                System.out.println("Crescente");
            } else{
                System.out.println("Decrescente");
            }
            X = sc.nextInt();
            Y = sc.nextInt();
        }

        sc.close();
    }
}