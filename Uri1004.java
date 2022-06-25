import java.util.Scanner;

public class Uri1004{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

         // BEE 1004: Produto simples

        // declaração
        int valor1, valor2, PROD;

        // entrada
        valor1 = teclado.nextInt();
        valor2 = teclado.nextInt();

        // processamento
        PROD = valor1 * valor2;

        // saída
        System.out.printf("PROD = %d\n", PROD);
        teclado.close();
    }
}