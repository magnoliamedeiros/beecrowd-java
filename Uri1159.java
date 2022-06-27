import java.util.Scanner;

public class Uri1159 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1159: Soma de Pares Consecutivos

        // declaração
        int valor, soma;

        // entrada
        valor = teclado.nextInt();

        // processamento
        while (true) {
            if (valor == 0 ){
                break;
            }

            soma = 0;

            if (valor % 2 == 0) {
                soma = soma + valor;
            } else {
                soma = valor + 1;
            }
        }
        teclado.close();
    }
}