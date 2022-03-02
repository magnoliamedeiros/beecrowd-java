import java.util.Scanner;
public class TestandoIf {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        double n1, n2, md;

        System.out.println("Digite a nota 1 e a nota 2: ");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();

        md = (n1 + n2) / 2;

        System.out.printf("Sua média final vale: %.2f\n", md);

        if ( md >= 6.0 ) {
            System.out.println("Aprovado - Parabéns!");
        } else {
            System.out.println("Oba! nos vemos ano que vem...");
        }

        System.out.println("Fim do programa!");

        teclado.close();
    }
}