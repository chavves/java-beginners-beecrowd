import java.util.Scanner;

public class beecrowd1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int X = sc.nextInt();

            if (X == 0){
                break;
            }

            StringBuilder sequencia = new StringBuilder();
                for (int i = 1; i <= X; i++){
                    sequencia.append(i);

                    if (i < X){
                        sequencia.append(" ");
                    }
                }

            System.out.println(sequencia);
        }

        sc.close();
    }
}
