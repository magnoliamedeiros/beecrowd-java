import java.util.Scanner;

public class Uri1011{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        // BEE 1011: Esfera

        // declaração
        double raio, volume;
        double PI = 3.14159;

        // entrada
        raio = teclado.nextDouble();

        // processamento
        volume = (4 / 3.0) * PI * (raio * raio * raio);

        // saída
        System.out.printf("VOLUME = %.3f\n", volume);
        teclado.close();
    }
}