import java.util.Scanner;

public class Uri1002{
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        // declaração
        double PI = 3.14159;
        double raio, area;

        // entrada
        raio = teclado.nextDouble();

        // processamento
        area = PI * (raio * raio);

        // saída
        System.out.printf("A=%.4f\n", area);
        teclado.close();
    }
}