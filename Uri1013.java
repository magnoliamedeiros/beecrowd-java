import java.util.Scanner;
import java.lang.Math;

public class Uri1013 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        // BEECROWD 1013: O Maior

        // DECLARAÇÃO
        int a, b, c, maiorAB, max;

        // ENTRADA
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        // PROCESSAMENTO
        maiorAB = (a + b + Math.abs(a - b)) / 2;
        max = (c + maiorAB + Math.abs(maiorAB - c)) / 2;

        // SAÍDA
        System.out.println(max + " eh o maior");

        teclado.close();
    }
}