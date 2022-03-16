import java.util.Scanner;

public class Uri1074 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1074: Par ou Impar

        // declaracao de variaveis
        int valor;
        int repeticoes;

        // entrada
        // numeros me dah a quantida de repeticoes
        repeticoes = teclado.nextInt();

        // processamento e saida
        for (int cont = 0; cont < repeticoes; cont++) {

            // entrada dos valores
            valor = teclado.nextInt();

            // vamos testar
            if (valor == 00) {
                System.out.println("NULL");
            }
            else if (valor % 2 == 0 && valor > 0) {
                System.out.println("EVEN POSITIVE");
            }
            else if (valor % 2 == 0 && valor < 0) {
                System.out.println("EVEN NEGATIVE");
            }
            else if (valor % 2 != 0 && valor > 0) {
                System.out.println("ODD POSITIVE");
            }
            else if (valor % 2 !=0 && valor < 0) {
                System.out.println("ODD NEGATIVE");
            }
        }

        teclado.close();
    }
}