public class ProjetoTesteException {
    public static void main (String[] args) {
        int a, b, c;
        a = 5;
        b = 0;

        c = a / b; // a interrupção do código acontece aqui

        System.out.println("Valor = " +c);
    }
}
