import java.util.Scanner;

public class Uri1114v3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        // BEE 1114: Senha Fixa (v3)

        // declaracao de variaveis
        int senha;

        while (true) {
            senha = teclado.nextInt();

            if (senha == 2002) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }

        teclado.close();
    }
}