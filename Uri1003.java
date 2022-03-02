import java.util.Scanner;

public class Uri1003{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, SOMA;

        // entrada
        A = teclado.nextInt();
        B = teclado.nextInt();

        // processamento
        SOMA = A + B;

        // saída
        System.out.println("SOMA = " + SOMA);     
    }
}