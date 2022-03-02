import java.util.Scanner;

public class VariasLeituras {

    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor1, valor2;
        double valor3;
        String nome;

        System.out.println("Digite alguns valores");
        // valor1 = teclado.nextInt();
        // valor2 = teclado.nextInt();
        // valor3 = teclado.nextDouble();

        // usando a conversão de tipos
        valor1 = Integer.parseInt(teclado.nextLine());
        valor2 = Integer.parseInt(teclado.nextLine());
        valor3 = Double.parseDouble(teclado.nextLine());

        System.out.println("Digite o seu nome: ");
        nome = teclado.nextLine();

        System.out.printf("Você tb digitou: %d - %d - %.2f\n", valor1, valor2, valor3);
        System.out.println("E o seu nome é: "+ nome);

        teclado.close(); // boa prática fechar
    }
}