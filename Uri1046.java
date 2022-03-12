import java.util.Scanner;

public class Uri1046 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1046: Tempo de Jogo

        // declaração de variáveis
        int horaInicial;
        int horaFinal;
        int duracao;

        // entrada
        horaInicial = teclado.nextInt();
        horaFinal = teclado.nextInt();

        // processamento
        duracao = horaFinal - horaInicial;

        if (duracao <= 0) {
            duracao = duracao + 24;
        }

        // saída
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        teclado.close();
    }
}