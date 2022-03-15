import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1066: Pares, Impares, Positivos e Negativos
        
        // declaração de variáveis
        int valores;
        int qtdPares = 0;
        int qtdImpares = 0;
        int qtdPositivos = 0;
        int qtdNegativos = 0;

        // processamento
        // lendo cinco valores inteiros
        for (int cont = 1; cont <= 5; cont++) {
            valores = teclado.nextInt();
            
            // para cada valor par/ímpar lido conte!
            if (valores % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }

            if (valores > 0) {
                qtdPositivos++;
            } else if (valores < 0) {
                qtdNegativos++;
            }
        }

        // saída
        System.out.println(qtdPares + " valor(es) par(es)");
        System.out.println(qtdImpares + " valor(es) impar(es)");
        System.out.println(qtdPositivos + " valor(es) positivo(s)");
        System.out.println(qtdNegativos + " valor(es) negativo(s)");
        
        teclado.close();
    }
}