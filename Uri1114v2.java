import java.util.Scanner;

public class Uri1114v2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        // BEE 1114: Senha Fixa (v2)

        // declaracao de variaveis
        int senha;

        do {
            // entrada
            senha = teclado.nextInt();

            // processamento e saida 1
            if (senha != 2002) {
                System.out.println("Senha Invalida");
            }
        } while (senha != 2002);

        // saida 2
        System.out.println("Acesso Permitido");

        teclado.close();
    }
}