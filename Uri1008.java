import java.util.Scanner;

public class Uri1008 {

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        // declação
        int numeroDoFuncionario, horasTrabalhadas;
        double valorPorHora, valorRecebido;

        // entrada
        numeroDoFuncionario = teclado.nextInt();
        horasTrabalhadas = teclado.nextInt();
        valorPorHora = teclado.nextDouble();

        // processamento
        valorRecebido = horasTrabalhadas * valorPorHora;

        // saída
        System.out.printf("NUMBER = %d\n", numeroDoFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", valorRecebido);
    }
}