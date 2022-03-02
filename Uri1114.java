import java.util.Scanner;

public class Uri1114{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int senha;

        do {
            senha = teclado.nextInt();
            if (senha == 2002){
                System.out.println("Acesso permitido!");
            } else {
                System.out.println("Senha inválida!");
            }
        } while(senha != 2002);

        teclado.close();
    }
}