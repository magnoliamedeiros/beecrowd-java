import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1064: Números e Média
        
        // declaração de variáveis
        float valor;
        float media = 0;
        int qtdPositivos = 0;

        // processamento
        // lendo seis valores
        for (int cont = 1; cont <= 6; cont++) {
            valor = teclado.nextFloat();
            
            // para cada valor positivo lido conte e armazene!
            if (valor > 0) {
                qtdPositivos++;
                media = media + valor;
            }
        }

        // saída
        System.out.println(qtdPositivos + " valores positivos");
        System.out.printf("%.1f\n", media / qtdPositivos);
        
        teclado.close();
    }
}