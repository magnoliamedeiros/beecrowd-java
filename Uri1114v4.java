import java.util.Scanner;

public class Uri1114v4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        // BEE 1114: Senha Fixa (v4)

        // declaracao de variaveis
        int senha;

        // entrada
        senha = teclado.nextInt();

        //  processamento
        while (senha != 2002) {
            System.out.println("Senha Invalida");
            // ler novamente
            senha = teclado.nextInt();
        }
        
        // saida
        System.out.println("Acesso Permitido");

        teclado.close();
    }
}