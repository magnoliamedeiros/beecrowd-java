import java.util.Scanner;

public class Uri1014 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1014: Consumo

        // declaracao de variaveis
        int distanciaTotalPercorrida;
        double combustivelGasto;
        double consumoMedio;

        // entrada
        distanciaTotalPercorrida = teclado.nextInt();
        combustivelGasto = teclado.nextDouble();

        // processamento
        consumoMedio = (float)distanciaTotalPercorrida/combustivelGasto;

        // saida
        System.out.printf("%.3f km/l\n", consumoMedio);

        teclado.close(); 
    }
}