import java.util.Locale;
import java.util.Scanner;

public class beecrowd1049 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String palavra1 = sc.nextLine();
        String palavra2 = sc.nextLine();
        String palavra3 = sc.nextLine();

        String resultado;

        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    resultado = "aguia";
                } else {
                    resultado = "pomba";
                }
            } else {
                if (palavra3.equals("onivoro")) {
                    resultado = "homem";
                } else {
                    resultado = "vaca";
                }
            }
        } else {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    resultado = "pulga";
                } else {
                    resultado = "lagarta";
                }
            } else {
                if (palavra3.equals("hematofago")) {
                    resultado = "sanguessuga";
                } else {
                    resultado = "minhoca";
                }
            }
        }

        System.out.println(resultado);

        sc.close();
    }
}