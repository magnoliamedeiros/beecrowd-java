import java.util.Scanner;

public class Uri1005{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        // BEE 1005: Média I
        
        // declaracao de variaveis
        double a, b, media;

        // entrada
        a = teclado.nextDouble();
        b = teclado.nextDouble();

        // processamento
        media = (a * 3.5 + b * 7.5) / 11;
    
        // saida com 5 digitos de precisao
        System.out.printf("MEDIA = %.5f\n", media);

        teclado.close();
    }
}