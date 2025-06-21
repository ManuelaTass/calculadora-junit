import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Testes unitários para a classe Calculadora
 * @author Seu Nome
 * @version 1.0
 */
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
}