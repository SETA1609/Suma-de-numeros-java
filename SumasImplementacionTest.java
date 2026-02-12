import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * E2E tests for the 3 main functions of SumasImplementacion
 */
public class SumasImplementacionTest {

    private SumasImplementacion operaciones;
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    @BeforeEach
    public void setUp() {
        operaciones = new SumasImplementacion();
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    private String getOutput() {
        return outputStream.toString();
    }

    // ===== E2E Tests for Function 1: ejecutarSuma1al25 =====

    @Test
    @DisplayName("Función 1: ejecutarSuma1al25 imprime la suma 325")
    public void testEjecutarSuma1al25_imprimeSuma() {
        operaciones.ejecutarSuma1al25();
        String output = getOutput();
        assertTrue(output.contains("325"), "La salida debe contener el resultado 325");
    }

    @Test
    @DisplayName("Función 1: ejecutarSuma1al25 muestra el encabezado correcto")
    public void testEjecutarSuma1al25_encabezado() {
        operaciones.ejecutarSuma1al25();
        String output = getOutput();
        assertTrue(output.contains("Suma de los números del 1 al 25"),
                "La salida debe contener el encabezado de la función 1");
    }

    // ===== E2E Tests for Function 2: ejecutarSumaYPromedioEntreAyb =====

    @Test
    @DisplayName("Función 2: Suma y promedio entre 1 y 10")
    public void testEjecutarSumaYPromedioEntreAyB_1a10() {
        Scanner sc = new Scanner("1\n10\n");
        operaciones.ejecutarSumaYPromedioEntreAyb(sc);
        String output = getOutput();
        assertTrue(output.contains("55"), "La salida debe contener la suma 55");
        assertTrue(output.contains("5.5"), "La salida debe contener el promedio 5.5");
    }

    @Test
    @DisplayName("Función 2: Suma y promedio entre 3 y 7")
    public void testEjecutarSumaYPromedioEntreAyB_3a7() {
        Scanner sc = new Scanner("3\n7\n");
        operaciones.ejecutarSumaYPromedioEntreAyb(sc);
        String output = getOutput();
        assertTrue(output.contains("25"), "La salida debe contener la suma 25");
        assertTrue(output.contains("5.0"), "La salida debe contener el promedio 5.0");
    }

    @Test
    @DisplayName("Función 2: Valores invertidos (B > A) se manejan correctamente con Math.min/max")
    public void testEjecutarSumaYPromedioEntreAyB_invertidos() {
        Scanner sc = new Scanner("10\n1\n");
        operaciones.ejecutarSumaYPromedioEntreAyb(sc);
        String output = getOutput();
        assertTrue(output.contains("55"), "La salida debe contener la suma 55");
        assertTrue(output.contains("5.5"), "La salida debe contener el promedio 5.5");
    }

    @Test
    @DisplayName("Función 2: Valores iguales A=B=5")
    public void testEjecutarSumaYPromedioEntreAyB_iguales() {
        Scanner sc = new Scanner("5\n5\n");
        operaciones.ejecutarSumaYPromedioEntreAyb(sc);
        String output = getOutput();
        assertTrue(output.contains("Suma de los números entre 5 y 5: 5"),
                "La salida debe contener la suma 5 entre 5 y 5");
    }

    // ===== E2E Tests for Function 3: ejecutarSumaIndeterminada =====

    @Test
    @DisplayName("Función 3: Suma un solo número y termina")
    public void testEjecutarSumaIndeterminada_unNumero() {
        // Input: 42 (número), n (no más números), n (no repetir programa)
        Scanner sc = new Scanner("42\nn\nn\n");
        boolean result = operaciones.ejecutarSumaIndeterminada(sc);
        String output = getOutput();
        assertTrue(output.contains("42.0"), "La salida debe contener la suma 42.0");
        assertFalse(result, "Debe retornar false al no querer repetir");
    }

    @Test
    @DisplayName("Función 3: Suma varios números y termina")
    public void testEjecutarSumaIndeterminada_variosNumeros() {
        // Input: 10, s (sí continuar), 20, s (sí continuar), 30, n (no más), n (no repetir)
        Scanner sc = new Scanner("10\ns\n20\ns\n30\nn\nn\n");
        boolean result = operaciones.ejecutarSumaIndeterminada(sc);
        String output = getOutput();
        assertTrue(output.contains("60.0"), "La salida debe contener la suma final 60.0");
        assertFalse(result, "Debe retornar false al no querer repetir");
    }

    @Test
    @DisplayName("Función 3: Suma números decimales")
    public void testEjecutarSumaIndeterminada_decimales() {
        // Input: 1.5, s (sí continuar), 2.5, n (no más), n (no repetir)
        Scanner sc = new Scanner("1.5\ns\n2.5\nn\nn\n");
        boolean result = operaciones.ejecutarSumaIndeterminada(sc);
        String output = getOutput();
        assertTrue(output.contains("4.0"), "La salida debe contener la suma 4.0");
        assertFalse(result, "Debe retornar false al no querer repetir");
    }

    @Test
    @DisplayName("Función 3: Elige repetir el programa completo")
    public void testEjecutarSumaIndeterminada_repetir() {
        // Input: 5 (número), n (no más números), s (sí repetir programa)
        Scanner sc = new Scanner("5\nn\ns\n");
        boolean result = operaciones.ejecutarSumaIndeterminada(sc);
        assertTrue(result, "Debe retornar true al querer repetir el programa");
    }
}
