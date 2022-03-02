import java.util.Scanner; // é um componente/biblioteca, um tipo de dado

public class Leitura{
    public static void main(String args[]){

        // primeira coisa - declarar uma 'variável' do tipo scanner
        Scanner teclado;

        // segunda coisa - instanciar, tornar ativo o componente 'teclado' apontando o dispositivo de entrada padão
        teclado = new Scanner(System.in); // Scanner teclado = new Scanner(System.in); funciona do mesmo modo
        
        int valorInteiro;
        System.out.println("Digite um valor inteiro:");
        valorInteiro = teclado.nextInt();
        System.out.println("Você digitou o valor: " + valorInteiro);

        double valorDouble;
        System.out.println("Digite um valor REAL!");
        valorDouble = teclado.nextDouble();
        System.out.println("Você digitou o valor: " + valorDouble);

        teclado.close(); // fecha a entrada
    }
}