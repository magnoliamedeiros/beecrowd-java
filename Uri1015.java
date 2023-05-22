import java.util.Scanner;

public class Uri1015 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1015: Distância entre dois pontos
        
        // declaracao de variaveis
        double x1, y1;
        double x2, y2;
        double calcularDistancia;
        double calcularRaiz;

        // entrada
        x1 = teclado.nextDouble();
        y1 = teclado.nextDouble();

        x2 = teclado.nextDouble();
        y2 = teclado.nextDouble();
        
        // processamento
        calcularDistancia = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        calcularRaiz = Math.sqrt(calcularDistancia);

        // saida
        System.out.printf("%.4f%n", calcularRaiz);
        
        teclado.close();         
    }
}