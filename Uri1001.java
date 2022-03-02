import java.util.Scanner;

public class Uri1001{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
       
        // declaração das variáveis
        int a, b, x;

        // entrada
        a = teclado.nextInt();
        b = teclado.nextInt();

        // processamento
        x = a + b;

        // saída
        System.out.println("X = " + x);

        teclado.close();
    }
}