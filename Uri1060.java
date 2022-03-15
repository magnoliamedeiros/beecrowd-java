import java.util.Scanner;

public class Uri1060 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1060: Números Positivos
        
        // declaração de variáveis
        float valor;
        int qtdPositivos = 0;

        // processamento
        // lendo seis valores
        for (int cont = 1; cont <= 6; cont++) {
            valor = teclado.nextFloat();

            // para cada valor positivo lido conte!
            if (valor > 0) {
                qtdPositivos++;
            }
        }

        // saída
        System.out.println(qtdPositivos + " valores positivos");
        
        teclado.close();
    }
}