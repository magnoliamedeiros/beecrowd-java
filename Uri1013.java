import java.util.Scanner;
import java.lang.Math;

public class Uri1013 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1013: O maior

        // declaracao de variaveis
        int a, b, c, maiorAB, max;

        // entrada
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        // processamento
        maiorAB = (a + b + Math.abs(a - b)) / 2;
        max = (c + maiorAB + Math.abs(maiorAB - c)) / 2;

        // saida
        System.out.println(max + " eh o maior");

        teclado.close();
    }
}