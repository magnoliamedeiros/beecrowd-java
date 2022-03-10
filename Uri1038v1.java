import java.util.Scanner;

public class Uri1038v1 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1038: Lanche (Versão extensa)

        // declaração de variáveis
        int codigo, quantidade;
        double total;

        // entrada
        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();

        // processamento
        if (codigo == 1) {      // o código é 1?
            total = quantidade * 4.0;
        } else {                // o código NÃO é 1, então pode ser 2, 3, 4 ou 5
            // então começamos de novo
            if (codigo == 2) {              // o código é 1?
                total = quantidade * 4.50;
            } else {                        // o código NÃO é 2, então pode ser 3, 4 ou 5
                // então verificamos de novo
                if (codigo == 3) {              // o código é 3?
                    total = quantidade * 5.0;
                } else {                        // o código NÃO é 3, então pode ser 4 ou 5
                    // então verificamos novamente
                    if (codigo == 4) {              // o código é 4?
                        total = quantidade * 2.0;
                    } else {                        // o código NÃO é 4, só pode ser 5
                        total = quantidade * 1.50;
                    }
                }
            }
        }

        // saída
        System.out.printf("Total: R$ %.2f\n", total);

        teclado.close();
    }
}