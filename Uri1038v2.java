import java.util.Scanner;

public class Uri1038v2 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1038: Lanche (v2)

        // declaracao de variaveis
        int codigo, quantidade;
        double total;

        // entrada
        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();

        // processamento
        if (codigo == 1) {          // o codigo eh 1?
            total = quantidade * 4.0;
        }
        else if (codigo == 2) {     // o codigo eh 2?
            total = quantidade * 4.50;
        } else if (codigo == 3) {   // o codigo eh 3?
            total = quantidade * 5.0;
        } else if (codigo == 4) {   // o codigo eh 4?
            total = quantidade * 2.0;
        } else {                    // o codigo NAO eh 4, soh pode ser 5
            total = quantidade * 1.50;
        }

        // saida
        System.out.printf("Total: R$ %.2f\n", total);

        teclado.close();
    }
}