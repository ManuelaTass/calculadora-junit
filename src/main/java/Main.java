
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println("=== Calculator Demo ===");
        
        // Addition examples
        System.out.println("Addition:");
        System.out.println("5 + 3 = " + calculator.add(5, 3));
        System.out.println("-2 + 7 = " + calculator.add(-2, 7));
        System.out.println("0 + 0 = " + calculator.add(0, 0));
        
        // Subtraction examples
        System.out.println("\nSubtraction:");
        System.out.println("10 - 4 = " + calculator.subtract(10, 4));
        System.out.println("-5 - (-3) = " + calculator.subtract(-5, -3));
        System.out.println("7 - 0 = " + calculator.subtract(7, 0));
        
        // Multiplication examples
        System.out.println("\nMultiplication:");
        System.out.println("6 * 4 = " + calculator.multiply(6, 4));
        System.out.println("-3 * 5 = " + calculator.multiply(-3, 5));
        System.out.println("8 * 0 = " + calculator.multiply(8, 0));
        
        // Division examples
        System.out.println("\nDivision:");
        System.out.println("15 / 3 = " + calculator.divide(15, 3));
        System.out.println("-12 / 4 = " + calculator.divide(-12, 4));
        System.out.println("0 / 5 = " + calculator.divide(0, 5));
        
        // Division by zero example
        System.out.println("\nDivision by zero example:");
        try {
            calculator.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\n=== End Demo ===");
    }
}
