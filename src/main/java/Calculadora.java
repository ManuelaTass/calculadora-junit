

public class Calculadora {
    public Calculadora() {
    }

//Realiza a operação de adição entre dois números
   
    public double somar(double a, double b) {
        return a + b;
    }

    //SUBTRAÇÂO

 // Realiza a operação de subtração entre dois números
   
    public double subtrair(double a, double b) {
        return a - b;
    }

    //MULTIPLICAÇÂO
    
 // Realiza a operação de multiplicação entre dois números

    public double multiplicar(double a, double b) {
        return a * b;
    }

   // DIVISÂO 

    public double dividir(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida");
        }
        return a / b;
    }
}
