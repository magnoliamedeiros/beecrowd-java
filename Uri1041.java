import java.util.Scanner;

public class Uri1041 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1041: Coordenadas de um Ponto

        // declaração de variáveis
        float x, y;

        // entrada
        x = teclado.nextFloat();
        y = teclado.nextFloat();

        // processamento e saída
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        else if (x != 0 && y == 0) {
            System.out.println("Eixo X");
        }
        else if (x == 0 && y != 0) {
            System.out.println("Eixo Y");
        }

        teclado.close();
    }
}