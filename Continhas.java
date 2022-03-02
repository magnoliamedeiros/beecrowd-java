public class Continhas {
    public static void main (String[] args) {
        int a, b, c;
        a = 27;
        b = 4;

        c = a + b;
        System.out.println("O valor de C => a + b = " + c);

        c = a - b;
        System.out.println("O valor de C => a - b = " + c);

        c = a * b;
        System.out.println("O valor de C => a * b = " + c);

        c = a / b; // Apenas a parte inteira, a divisão inteira irá mostrar apenas a parte inteira
        System.out.println("O valor de C => a / b = " + c);

        c = a % b; // Irá mostrar o resto da divisão
        System.out.println("O valor de C => a % b = " + c);

        // float d = 3.0/2; // se colocar 3.0 não irá funcionar, pq para o java é double
        // float d = 3.0f/2; // conversão forçada
        // float d = (float)3/2;  // tb funciona
        float d = 3F/2; // tb funciona
        System.out.println("O valor de D = " + d);
    }
}