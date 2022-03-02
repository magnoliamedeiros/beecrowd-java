import java.util.Scanner;

public class Uri1007{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        // declaração
        int a, b, c, d, diferenca;

        // entrada
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        // processamento
        diferenca = (a * b) - (c * d);

        // saída
        System.out.println("DIFERENCA = " + diferenca);
        teclado.close();
    }
}