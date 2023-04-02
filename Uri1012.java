import java.util.Scanner;

public class Uri1012{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        // BEE 1012: Área

        // declaracao de variaveis
        double a, b, c;
        double PI = 3.14159;

        // entrada
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        // processamento

        // area do triangulo
        double triangulo = (a * c) / 2;

        // area do circulo
        double circulo = PI * (c * c);

        // area do trapezio
        double trapezio = (a + b) * c / 2;
        
        // area do quadrado
        double quadrado = b * b;
        
        // area do retangulo
        double retangulo = a * b;

        // saida
        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
        
        teclado.close();
    }
}