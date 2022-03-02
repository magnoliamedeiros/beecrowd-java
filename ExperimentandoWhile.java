public class ExperimentandoWhile{

    public static void main(String args[]){

        int numero = 0;

        while (numero <= 10) {
            System.out.println("o valor do numero = " + numero);
            // numero++; incrementa apenas 1 unidade
            numero = numero + 1; // modificando a variável que faz parte da condição
            // numero += 2;
        }

        System.out.println("Fim do código.");
    }
}