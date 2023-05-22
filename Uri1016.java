import java.util.Scanner;

public class Uri1016 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1016: Distância

        // declaracao de variaveis
        int distancia;
        int quantidadeMinutos;
        int minutos = 60;
        int km = 30;

        // entrada
        distancia = teclado.nextInt();

        // processamento
        quantidadeMinutos = (minutos * distancia) / km;

        // saida
        System.out.println(quantidadeMinutos + " minutos");

        teclado.close();
    }
}
