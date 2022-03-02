public class ExperimentandoDoWhile {
    public static void main (String[] args) {
        int numero = 100;

        // Executa pelo menos 1 vez
        do {
            System.out.println("O valor do numero = " + numero);
            numero++;
        } while (numero <= 10);
    }
}