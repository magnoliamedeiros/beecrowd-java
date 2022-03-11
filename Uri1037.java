import java.util.Scanner;

public class Uri1037 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // BEE 1037: Intervalo

        // declaração de variáveis
        double numero;

        // entrada
        numero = teclado.nextDouble();

        // processamento e saída
        if (numero >= 0 && numero <= 25) {
            System.out.println("Intervalo [0,25]");
        }
        else if (numero > 25 && numero <= 50) {
            System.out.println("Intervalo (25,50]");
        }
        else if (numero > 50 && numero <= 75)  {
            System.out.println("Intervalo (50,75]");
        }
        else if (numero > 75 && numero <= 100) {
            System.out.println("Intervalo (75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }

        teclado.close();
    }
}