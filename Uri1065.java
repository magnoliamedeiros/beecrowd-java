import java.util.Scanner;

public class Uri1065 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1065: Pares entre Cinco Números
        
        // declaração de variáveis
        int valor;
        int qtdPar = 0;

        // processamento
        // lendo cinco valores inteiros
        for (int cont = 1; cont <= 5; cont++) {
            valor = teclado.nextInt();
            
            // para cada valor par lido conte!
            if (valor % 2 == 0) {
                qtdPar++;
            }
        }

        // saída
        System.out.println(qtdPar + " valores pares");
        
        teclado.close();
    }
}