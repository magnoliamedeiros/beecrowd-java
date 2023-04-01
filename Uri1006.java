import java.util.Scanner;

public class Uri1006{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        // BEE 1006: Média II

        // declacao de variaveis
        double notaA, notaB, notaC, MEDIA;

        // entrada
        notaA = teclado.nextDouble();
        notaB = teclado.nextDouble();
        notaC = teclado.nextDouble();

        // processamento
        MEDIA = (notaA * 2 + notaB * 3 + notaC*5)/10;

        // saida
        System.out.printf("MEDIA = %.1f\n", MEDIA);

        teclado.close();
    }
}