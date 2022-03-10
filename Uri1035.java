/**
Leia 4 valores inteiros A, B, C e D. A seguir,
    (1) se B for maior do que C e 								B > C
    (2) se D for maior do que A, e 								D > A
    (3) a soma de C com D for maior que a soma de A e B 		C + D > A + B
    (4) e se C e D, ambos, forem positivos e 					C > 0 && D > 0
    (5) se a variável A for par									A % 2 == 0
Dica
  if (1 && 2 && 3 && 4 && 5)
*/

import java.util.Scanner;

public class Uri1035 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1035: Teste de Seleção 1

        // declaração de variáveis
        int a, b, c, d, somaAB, somaCD;

        // entrada
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        // processamento
        somaCD = c + d;
        somaAB = a + b;

        if ((b > c) && (d > a) && (somaCD > somaAB) && (a % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        teclado.close();
    }
}