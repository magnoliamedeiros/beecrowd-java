import java.util.Scanner;

public class Uri1115v1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1115: Quadrante (v1)

        // declaração
        int x, y; 

        // entrada, processamento e saída
        do {

            x = teclado.nextInt();
            y = teclado.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }

            /**
                if (x == 0 || y == 0) {
                    break;
                }
            */

        } while (x != 0 && y != 0); // equivale tb -> while (x * y != 0)

        teclado.close();
    }
}