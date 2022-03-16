import java.util.Scanner;

public class Uri2483 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 2483: Feliz Nataaal!
        
        // declaracao de variaveis
        int i;

        // entrada
        i = teclado.nextInt();

        // processamento
        System.out.print("Feliz nat");

        for (int cont = 0; cont < i; cont++) {
            System.out.print("a");
        }

        // saida
        System.out.println("l!");
        
        teclado.close();
    }
}