
/**
 * Classe Calculadora com operações matemáticas básicas
 * @author Seu Nome
 * @version 1.0
 */
public class Calculadora {
    
    /**
     * Construtor da classe Calculadora
     */
    public Calculadora() {
        // Construtor vazio - a calculadora não precisa de inicialização especial
    }
    
    /**
     * Realiza a operação de adição entre dois números
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da soma a + b
     */
    public double somar(double a, double b) {
        return a + b;
    }
    
    /**
     * Realiza a operação de subtração entre dois números
     * @param a primeiro número (minuendo)
     * @param b segundo número (subtraendo)
     * @return resultado da subtração a - b
     */
    public double subtrair(double a, double b) {
        return a - b;
    }
    
    /**
     * Realiza a operação de multiplicação entre dois números
     * @param a primeiro número (multiplicando)
     * @param b segundo número (multiplicador)
     * @return resultado da multiplicação a * b
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    /**
     * Realiza a operação de divisão entre dois números
     * @param a primeiro número (dividendo)
     * @param b segundo número (divisor)
     * @return resultado da divisão a / b
     * @throws ArithmeticException se o divisor for zero
     */
    public double dividir(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida");
        }
        return a / b;
    }
}
