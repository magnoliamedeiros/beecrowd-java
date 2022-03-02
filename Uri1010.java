import java.util.Scanner;

public class Uri1010 {

    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1010: Cálculo Simples

        // declaração de variáveis
        int codigo1, codigo2, quantidade1, quantidade2;
        double valorUnitario1, valorUnitario2, subTotalPagar1, subTotalPagar2, total;

        // entrada
        codigo1 = teclado.nextInt();
        quantidade1 = teclado.nextInt();
        valorUnitario1 = teclado.nextDouble();

        codigo2 = teclado.nextInt();
        quantidade2 = teclado.nextInt();    
        valorUnitario2 = teclado.nextDouble();

        // processamento
        subTotalPagar1 = valorUnitario1 * quantidade1;
        subTotalPagar2 = valorUnitario2 * quantidade2;

        total = subTotalPagar1 + subTotalPagar2;

        // saída
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        
        teclado.close();
    }
}