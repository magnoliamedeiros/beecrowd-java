import java.util.Scanner;

public class Uri1067v2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1067: Numeros Impares (v2)
        
        // declaração de variáveis
        int valor;
        int cont;
        
        // entrada
        valor = teclado.nextInt();

        // processamento
        for (cont = 1; cont <= valor; cont+=2) {
            // saída
            System.out.println(cont);
        }

        teclado.close();
    }
}