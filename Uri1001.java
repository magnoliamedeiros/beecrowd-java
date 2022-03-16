import java.util.Scanner;

public class Uri1001 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1001: Extremamente Basico

        // declaracao de variaveis
        int a, b, x;

        // entrada
        a = teclado.nextInt();
        b = teclado.nextInt();

        // processamento
        x = a + b;

        // saida
        System.out.println("X = " + x);

        teclado.close();
    }
}