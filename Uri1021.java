import java.util.Scanner;

public class Uri1021 {

    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        // BEE 1021: Notas e Moedas

        // Declaração de variáveis
        double valor, centavos;
        int cedulaN, moedaN;
        int q100, q50, q20, q10, q5, q2, q1;
        int q050, q025, q010, q005, q001;
        int resto;

        // Entrada
        valor = teclado.nextDouble();

        // Processamento
        // separar a parte inteira da parte decimal
        cedulaN = (int)valor; // pegando apenas a parte inteira

        centavos = valor - cedulaN; // pegando apenas os centavos

        // convertendo os centavos em inteiro
        moedaN = (int)(centavos * 100);

        // cédulas 
        q100    = cedulaN / 100;
        resto   = cedulaN % 100; // o que sobra armazena no resto

        q50     = resto / 50;
        resto   = resto % 50;

        q20     = resto / 20;
        resto   = resto % 20;

        q10     = resto / 10;
        resto   = resto % 10;

        q5      = resto / 5;
        resto   = resto % 5; // equivale a resto %= 5

        q2      = resto / 2;
        resto   = resto % 2;

        q1      = resto / 1;
        resto   = resto % 1;

        // moedas
        q050    = moedaN / 50;
        resto   = moedaN % 50;

        q025 = resto / 25;
        resto = resto % 25;

        q010    = resto / 10;
        resto   = resto % 10;

        q005    = resto / 5;
        q001   = resto % 5;

        // Saída
        System.out.println("NOTAS:");
        System.out.println(q100 + " nota(s) de R$ 100.00");
        System.out.println(q50 + " nota(s) de R$ 50.00");
        System.out.println(q20 + " nota(s) de R$ 20.00");
        System.out.println(q10 + " nota(s) de R$ 10.00");
        System.out.println(q5 + " nota(s) de R$ 5.00");
        System.out.println(q2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(q1 + " moeda(s) de R$ 1.00");
        System.out.println(q050 + " moeda(s) de R$ 0.50");
        System.out.println(q025 + " moeda(s) de R$ 0.25");
        System.out.println(q010 + " moeda(s) de R$ 0.10");
        System.out.println(q005 + " moeda(s) de R$ 0.05");
        System.out.println(q001 + " moeda(s) de R$ 0.01");

        teclado.close();
    }
}