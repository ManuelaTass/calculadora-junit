public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("=== Demonstração da Calculadora ===");

        // Exemplos de adição
        System.out.println("Adição:");
        System.out.println("5 + 3 = " + calculadora.somar(5, 3));
        System.out.println("-2 + 7 = " + calculadora.somar(-2, 7));
        System.out.println("0 + 0 = " + calculadora.somar(0, 0));

        // Exemplos de subtração
        System.out.println("\nSubtração:");
        System.out.println("5 - 3 = " + calculadora.subtrair(5, 3));
        System.out.println("-2 - 7 = " + calculadora.subtrair(-2, 7));
        System.out.println("10 - 0 = " + calculadora.subtrair(10, 0));

        // Exemplos de multiplicação
        System.out.println("\nMultiplicação:");
        System.out.println("5 * 3 = " + calculadora.multiplicar(5, 3));
        System.out.println("-2 * 7 = " + calculadora.multiplicar(-2, 7));
        System.out.println("4 * 0 = " + calculadora.multiplicar(4, 0));

        // Exemplos de divisão
        System.out.println("\nDivisão:");
        System.out.println("15 / 3 = " + calculadora.dividir(15, 3));
        System.out.println("-10 / 2 = " + calculadora.dividir(-10, 2));
        System.out.println("0 / 5 = " + calculadora.dividir(0, 5));
        
        // Exemplo de tratamento de divisão por zero
        try {
            System.out.println("10 / 0 = " + calculadora.dividir(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("10 / 0 = " + e.getMessage());
        }

        System.out.println("\n=== Fim da Demonstração ===");
    }
}