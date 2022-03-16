import java.util.Scanner;

public class Uri1174 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1174: Selecao em Vetor I

        // declaracao de variaveis
        double a[] = new double[100];

        // processamento e saida
        for (int i = 0; i < a.length; i++) {
            a[i] = teclado.nextDouble();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 10.0) {
                System.out.printf("A[%d] = %.1f\n", i, a[i]);
            }
        }

        teclado.close();
    }
}