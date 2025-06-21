public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("=== Demonstração da Calculadora ===");

        // Exemplos de adição
        System.out.println("Adição:");
        System.out.println("5 + 3 = " + calculadora.somar(5, 3));
        System.out.println("-2 + 7 = " + calculadora.somar(-2, 7));
        System.out.println("0 + 0 = " + calculadora.somar(0, 0));

        System.out.println("\n=== Fim da Demonstração ===");
    }
}