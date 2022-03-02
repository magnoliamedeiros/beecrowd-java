import java.util.Scanner;

public class Uri1009 {

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        // BEE 1009: Salário com Bônus

        // declaração
        String nome;
        double salarioFixo, montanteVendas, salarioFinal, comissao;

        // entrada
        nome = teclado.nextLine();
        salarioFixo = teclado.nextDouble();
        montanteVendas = teclado.nextDouble();

        // processamento
        comissao = (15 * montanteVendas) / 100;
        salarioFinal = salarioFixo + comissao;

        // saída
        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);
        
        teclado.close();
    }
}