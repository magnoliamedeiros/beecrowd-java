import java.util.Scanner;

public class Uri1067v1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1067: Numeros Impares (v1)
        
        // declaração de variáveis
        int valor;
        int cont = 0;
        
        // entrada
        valor = teclado.nextInt();

        // processamento
        while ( cont <= valor) {
            if (cont % 2 !=0 ) {    
                // saída
                System.out.println(cont);
            }
            cont++;
        }

        teclado.close();
    }
}