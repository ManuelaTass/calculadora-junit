
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    // Addition tests
    @Test
    void testAddPositiveNumbers() {
        assertEquals(8.0, calculator.add(5.0, 3.0), 0.001);
        assertEquals(10.5, calculator.add(7.5, 3.0), 0.001);
    }
    
    @Test
    void testAddNegativeNumbers() {
        assertEquals(-8.0, calculator.add(-5.0, -3.0), 0.001);
        assertEquals(-2.0, calculator.add(-7.0, 5.0), 0.001);
    }
    
    @Test
    void testAddWithZero() {
        assertEquals(5.0, calculator.add(5.0, 0.0), 0.001);
        assertEquals(0.0, calculator.add(0.0, 0.0), 0.001);
        assertEquals(-3.0, calculator.add(-3.0, 0.0), 0.001);
    }
    
    // Subtraction tests
    @Test
    void testSubtractPositiveNumbers() {
        assertEquals(2.0, calculator.subtract(5.0, 3.0), 0.001);
        assertEquals(4.5, calculator.subtract(7.5, 3.0), 0.001);
    }
    
    @Test
    void testSubtractNegativeNumbers() {
        assertEquals(-2.0, calculator.subtract(-5.0, -3.0), 0.001);
        assertEquals(-12.0, calculator.subtract(-7.0, 5.0), 0.001);
    }
    
    @Test
    void testSubtractWithZero() {
        assertEquals(5.0, calculator.subtract(5.0, 0.0), 0.001);
        assertEquals(0.0, calculator.subtract(0.0, 0.0), 0.001);
        assertEquals(-3.0, calculator.subtract(-3.0, 0.0), 0.001);
        assertEquals(-5.0, calculator.subtract(0.0, 5.0), 0.001);
    }
    
    // Multiplication tests
    @Test
    void testMultiplyPositiveNumbers() {
        assertEquals(15.0, calculator.multiply(5.0, 3.0), 0.001);
        assertEquals(22.5, calculator.multiply(7.5, 3.0), 0.001);
    }
    
    @Test
    void testMultiplyNegativeNumbers() {
        assertEquals(15.0, calculator.multiply(-5.0, -3.0), 0.001);
        assertEquals(-35.0, calculator.multiply(-7.0, 5.0), 0.001);
        assertEquals(-21.0, calculator.multiply(7.0, -3.0), 0.001);
    }
    
    @Test
    void testMultiplyWithZero() {
        assertEquals(0.0, calculator.multiply(5.0, 0.0), 0.001);
        assertEquals(0.0, calculator.multiply(0.0, 0.0), 0.001);
        assertEquals(0.0, calculator.multiply(-3.0, 0.0), 0.001);
        assertEquals(0.0, calculator.multiply(0.0, 7.0), 0.001);
    }
    
    // Division tests
    @Test
    void testDividePositiveNumbers() {
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.001);
        assertEquals(2.5, calculator.divide(7.5, 3.0), 0.001);
    }
    
    @Test
    void testDivideNegativeNumbers() {
        assertEquals(2.0, calculator.divide(-6.0, -3.0), 0.001);
        assertEquals(-1.4, calculator.divide(-7.0, 5.0), 0.001);
        assertEquals(-2.333, calculator.divide(7.0, -3.0), 0.001);
    }
    
    @Test
    void testDivideWithZero() {
        assertEquals(0.0, calculator.divide(0.0, 5.0), 0.001);
        assertEquals(0.0, calculator.divide(0.0, -3.0), 0.001);
    }
    
    @Test
    void testDivideByZeroThrowsException() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5.0, 0.0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
        
        // Test with negative number divided by zero
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(-5.0, 0.0);
        });
        
        // Test with zero divided by zero
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(0.0, 0.0);
        });
    }
    
    // Edge cases and additional tests
    @Test
    void testLargeNumbers() {
        assertEquals(2000000000.0, calculator.add(1000000000.0, 1000000000.0), 0.001);
        assertEquals(1000000000000000000.0, calculator.multiply(1000000000.0, 1000000000.0), 0.001);
    }
    
    @Test
    void testDecimalPrecision() {
        assertEquals(0.3, calculator.add(0.1, 0.2), 0.001);
        assertEquals(0.06, calculator.multiply(0.2, 0.3), 0.001);
    }
}
