import java.util.Scanner;

public class Uri1002 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // BEE 1002: Area do Circulo

        // declaracao de variaveis
        double PI = 3.14159;
        double raio, area;

        // entrada
        raio = teclado.nextDouble();

        // processamento
        area = PI * (raio * raio);

        // saida
        System.out.printf("A=%.4f\n", area);
        teclado.close();
    }
}