import java.util.Locale;
import java.util.Scanner;

public class beecrowd1041 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double eixoX = sc.nextDouble();
        double eixoY = sc.nextDouble();

        if (eixoX == 0 && eixoY == 0) {
            System.out.println("Origem");

        } else if (eixoX == 0) {
            System.out.println("Eixo y");
        } else if (eixoY == 0) {
            System.out.println("Eixo X");
        } else if (eixoX > 0 && eixoY > 0) {
            System.out.println("Q1");
        } else if (eixoX < 0 && eixoY > 0) {
            System.out.println("Q2");
        } else if (eixoX < 0 && eixoY < 0) {
            System.out.println("Q3");
        } else if (eixoX > 0 && eixoY < 0) {
            System.out.println("Q4");
        }
        sc.close();
    }
}