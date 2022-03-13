import java.util.Scanner;

public class Uri1047 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        // BEE 1047: Tempo de Jogo em Minutos

        // declaração de variáveis
        int horaInicial, horaFinal;
        int minutoInicial, minutoFinal;
        int tempoInicial, tempoFinal, tempoTotal;
        int horaTotal, minutoTotal;

        // entrada
        horaInicial = teclado.nextInt();
        minutoInicial = teclado.nextInt();
        horaFinal = teclado.nextInt();
        minutoFinal = teclado.nextInt();

        // processamento
        // convertendo todos para minutos
        tempoInicial = horaInicial * 60 + minutoInicial;
        tempoFinal = horaFinal * 60 + minutoFinal;

        tempoTotal = tempoFinal - tempoInicial;

        if (tempoTotal <= 0) {         // pode ser que o tempo dê negativo
            tempoTotal = tempoTotal + 24 * 60; // ou 1440
        }

        // desconverto
        horaTotal = tempoTotal / 60;
        minutoTotal = tempoTotal % 60;

        // saída
        System.out.println("O JOGO DUROU "+horaTotal+" HORA(S) E "+minutoTotal+" MINUTO(S)");

        teclado.close();
    }
}