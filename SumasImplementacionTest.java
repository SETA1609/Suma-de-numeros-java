import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for SumasImplementacion
 */
public class SumasImplementacionTest {

    private SumasImplementacion operaciones;

    @BeforeEach
    public void setUp() {
        operaciones = new SumasImplementacion();
    }

    // ===== Tests for Function 1: Sum of numbers from 1 to 25 =====

    @Test
    @DisplayName("Función 1: La suma de los números del 1 al 25 debe ser 325")
    public void testSuma1al25() {
        int resultado = operaciones.calcularSuma1al25();
        assertEquals(325, resultado, "La suma de 1 a 25 debe ser 325");
    }

    // ===== Tests for Function 2: Sum and average between A and B =====

    @Test
    @DisplayName("Función 2: Suma entre 1 y 10 debe ser 55")
    public void testSumaEntreAyB_1a10() {
        int resultado = operaciones.calcularSumaEntreAyB(1, 10);
        assertEquals(55, resultado, "La suma de 1 a 10 debe ser 55");
    }

    @Test
    @DisplayName("Función 2: Suma entre 5 y 5 debe ser 5")
    public void testSumaEntreAyB_iguales() {
        int resultado = operaciones.calcularSumaEntreAyB(5, 5);
        assertEquals(5, resultado, "La suma cuando A=B=5 debe ser 5");
    }

    @Test
    @DisplayName("Función 2: Suma entre 10 y 1 (invertidos) debe ser 55")
    public void testSumaEntreAyB_invertidos() {
        int resultado = operaciones.calcularSumaEntreAyB(10, 1);
        assertEquals(55, resultado, "La suma de 1 a 10 (invertidos) debe ser 55");
    }

    @Test
    @DisplayName("Función 2: Promedio entre 1 y 10 debe ser 5.5")
    public void testPromedioEntreAyB_1a10() {
        double resultado = operaciones.calcularPromedioEntreAyB(1, 10);
        assertEquals(5.5, resultado, 0.001, "El promedio de 1 a 10 debe ser 5.5");
    }

    @Test
    @DisplayName("Función 2: Promedio entre 3 y 7 debe ser 5.0")
    public void testPromedioEntreAyB_3a7() {
        double resultado = operaciones.calcularPromedioEntreAyB(3, 7);
        assertEquals(5.0, resultado, 0.001, "El promedio de 3 a 7 debe ser 5.0");
    }

    @Test
    @DisplayName("Función 2: Promedio con valores invertidos debe dar mismo resultado")
    public void testPromedioEntreAyB_invertidos() {
        double resultado = operaciones.calcularPromedioEntreAyB(7, 3);
        assertEquals(5.0, resultado, 0.001, "El promedio de 3 a 7 (invertidos) debe ser 5.0");
    }

    // ===== Tests for Function 3: Sum of indeterminate numbers =====

    @Test
    @DisplayName("Función 3: Suma de un solo número")
    public void testSumaDeNumeros_unNumero() {
        double[] numeros = {42.0};
        double resultado = operaciones.calcularSumaDeNumeros(numeros);
        assertEquals(42.0, resultado, 0.001, "La suma de un solo número debe ser ese número");
    }

    @Test
    @DisplayName("Función 3: Suma de varios números enteros")
    public void testSumaDeNumeros_variosEnteros() {
        double[] numeros = {10, 20, 30};
        double resultado = operaciones.calcularSumaDeNumeros(numeros);
        assertEquals(60.0, resultado, 0.001, "La suma de 10+20+30 debe ser 60");
    }

    @Test
    @DisplayName("Función 3: Suma de números decimales")
    public void testSumaDeNumeros_decimales() {
        double[] numeros = {1.5, 2.5, 3.0};
        double resultado = operaciones.calcularSumaDeNumeros(numeros);
        assertEquals(7.0, resultado, 0.001, "La suma de 1.5+2.5+3.0 debe ser 7.0");
    }

    @Test
    @DisplayName("Función 3: Suma de arreglo vacío debe ser 0")
    public void testSumaDeNumeros_vacio() {
        double[] numeros = {};
        double resultado = operaciones.calcularSumaDeNumeros(numeros);
        assertEquals(0.0, resultado, 0.001, "La suma de un arreglo vacío debe ser 0");
    }

    @Test
    @DisplayName("Función 3: Suma con números negativos")
    public void testSumaDeNumeros_negativos() {
        double[] numeros = {10, -3, 5, -2};
        double resultado = operaciones.calcularSumaDeNumeros(numeros);
        assertEquals(10.0, resultado, 0.001, "La suma de 10+(-3)+5+(-2) debe ser 10");
    }
}
