import java.util.Scanner;

public class Uri1114v1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        // BEE 1114: Senha Fixa (v1)

        // declaracao de variaveis
        int senha;

        do {
            // entrada
            senha = teclado.nextInt();

            // processamento e saida
            if (senha == 2002) {
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
            }
        } while (senha != 2002);

        teclado.close();
    }
}