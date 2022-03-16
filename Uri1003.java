import java.util.Scanner;

public class Uri1003 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        // BEE 1003: Soma Simples

        // declaracao de variaveis
        int a, b, soma;

        // entrada
        a = teclado.nextInt();
        b = teclado.nextInt();

        // processamento
        soma = a + b;

        // saida
        System.out.println("SOMA = " + soma);

        teclado.close();  
    }
}