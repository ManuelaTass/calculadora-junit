
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void configurar() {
        calculadora = new Calculadora();
    }

    // Testes para adição
    @Test
    void testeSomarNumerosPositivos() {
        assertEquals(8.0, calculadora.somar(5.0, 3.0), 0.001);
        assertEquals(10.5, calculadora.somar(7.5, 3.0), 0.001);
    }

    @Test
    void testeSomarNumerosNegativos() {
        assertEquals(-8.0, calculadora.somar(-5.0, -3.0), 0.001);
        assertEquals(-2.0, calculadora.somar(-7.0, 5.0), 0.001);
    }

    @Test
    void testeSomarComZero() {
        assertEquals(5.0, calculadora.somar(5.0, 0.0), 0.001);
        assertEquals(0.0, calculadora.somar(0.0, 0.0), 0.001);
        assertEquals(-3.0, calculadora.somar(-3.0, 0.0), 0.001);
    }

    @Test
    void testeSomarNumerosGrandes() {
        assertEquals(2000000000.0, calculadora.somar(1000000000.0, 1000000000.0), 0.001);
    }

    @Test
    void testeSomarPrecisaoDecimal() {
        assertEquals(0.3, calculadora.somar(0.1, 0.2), 0.001);
    }

    // Testes para subtração
    @Test
    void testeSubtrairNumerosPositivos() {
        assertEquals(2.0, calculadora.subtrair(5.0, 3.0), 0.001);
        assertEquals(4.5, calculadora.subtrair(7.5, 3.0), 0.001);
    }

    @Test
    void testeSubtrairNumerosNegativos() {
        assertEquals(-2.0, calculadora.subtrair(-5.0, -3.0), 0.001);
        assertEquals(-12.0, calculadora.subtrair(-7.0, 5.0), 0.001);
    }

    @Test
    void testeSubtrairComZero() {
        assertEquals(5.0, calculadora.subtrair(5.0, 0.0), 0.001);
        assertEquals(0.0, calculadora.subtrair(0.0, 0.0), 0.001);
        assertEquals(-3.0, calculadora.subtrair(0.0, 3.0), 0.001);
    }

    @Test
    void testeSubtrairNumerosGrandes() {
        assertEquals(0.0, calculadora.subtrair(1000000000.0, 1000000000.0), 0.001);
        assertEquals(500000000.0, calculadora.subtrair(1500000000.0, 1000000000.0), 0.001);
    }

    @Test
    void testeSubtrairPrecisaoDecimal() {
        assertEquals(0.1, calculadora.subtrair(0.3, 0.2), 0.001);
        assertEquals(-0.1, calculadora.subtrair(0.2, 0.3), 0.001);
    }

    // Testes para multiplicação
    @Test
    void testeMultiplicarNumerosPositivos() {
        assertEquals(15.0, calculadora.multiplicar(5.0, 3.0), 0.001);
        assertEquals(22.5, calculadora.multiplicar(7.5, 3.0), 0.001);
    }

    @Test
    void testeMultiplicarNumerosNegativos() {
        assertEquals(15.0, calculadora.multiplicar(-5.0, -3.0), 0.001);
        assertEquals(-35.0, calculadora.multiplicar(-7.0, 5.0), 0.001);
    }

    @Test
    void testeMultiplicarComZero() {
        assertEquals(0.0, calculadora.multiplicar(5.0, 0.0), 0.001);
        assertEquals(0.0, calculadora.multiplicar(0.0, 0.0), 0.001);
        assertEquals(0.0, calculadora.multiplicar(-3.0, 0.0), 0.001);
    }

    @Test
    void testeMultiplicarComUm() {
        assertEquals(5.0, calculadora.multiplicar(5.0, 1.0), 0.001);
        assertEquals(-3.0, calculadora.multiplicar(-3.0, 1.0), 0.001);
        assertEquals(7.5, calculadora.multiplicar(1.0, 7.5), 0.001);
    }

    @Test
    void testeMultiplicarNumerosGrandes() {
        assertEquals(1000000000000000000.0, calculadora.multiplicar(1000000000.0, 1000000000.0), 0.001);
    }

    @Test
    void testeMultiplicarPrecisaoDecimal() {
        assertEquals(0.06, calculadora.multiplicar(0.3, 0.2), 0.001);
        assertEquals(1.25, calculadora.multiplicar(2.5, 0.5), 0.001);
    }

    // Testes para divisão
    @Test
    void testeDividirNumerosPositivos() {
        assertEquals(5.0, calculadora.dividir(15.0, 3.0), 0.001);
        assertEquals(2.5, calculadora.dividir(7.5, 3.0), 0.001);
    }

    @Test
    void testeDividirNumerosNegativos() {
        assertEquals(1.666, calculadora.dividir(-5.0, -3.0), 0.001);
        assertEquals(-1.4, calculadora.dividir(-7.0, 5.0), 0.001);
    }

    @Test
    void testeDividirPorUm() {
        assertEquals(5.0, calculadora.dividir(5.0, 1.0), 0.001);
        assertEquals(-3.0, calculadora.dividir(-3.0, 1.0), 0.001);
        assertEquals(7.5, calculadora.dividir(7.5, 1.0), 0.001);
    }

    @Test
        void testDivisaoPorZero() {

            ArithmeticException ex = assertThrows(ArithmeticException.class, () -> {
                calculadora.dividir(10, 0);
            });

            assertEquals("Erro: Divisão por zero não é permitida", ex.getMessage());
        }

    @Test
    void testeDividirPrecisaoDecimal() {
        assertEquals(1.5, calculadora.dividir(0.3, 0.2), 0.001);
        assertEquals(5.0, calculadora.dividir(2.5, 0.5), 0.001);
    }
}
