import java.util.Locale;
import java.util.Scanner;

public class beecrowd1040 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float N1 = sc.nextFloat();
        float N2 = sc.nextFloat();
        float N3 = sc.nextFloat();
        float N4 = sc.nextFloat();

        float mediaFinal, notaExame;

        float media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;

        if (media >= 7.0) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno reprovado.");
        } else {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");
            notaExame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", notaExame);

            mediaFinal = (notaExame + media) / 2;

            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", mediaFinal);
        }
        sc.close();
    }
}

