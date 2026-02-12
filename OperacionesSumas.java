/**
 *
 * */
import java.util.Scanner;

public interface OperacionesSumas {

    /**
     * Ejecuta la primera operación:
     * Imprime la suma de los números del 1 al 25 (usando fórmula de Gauss)
     */
    void ejecutarSuma1al25();

    /**
     * Ejecuta la segunda operación:
     * Pide A y B por teclado, calcula e imprime suma y promedio
     * @param sc Scanner para leer entrada
     */
    void ejecutarSumaYPromedioEntreAyb(Scanner sc);

    /**
     * Ejecuta la tercera operación:
     * Suma indeterminada de números con opción de continuar
     * Al final pregunta si repetir el programa completo o terminar
     * @param sc Scanner para leer entrada
     * @return true si desea repetir el programa completo, false si quiere terminar
     */
    boolean ejecutarSumaIndeterminada(Scanner sc);

    /**
     * Calcula la suma de los números del 1 al 25
     * @return la suma
     */
    int calcularSuma1al25();

    /**
     * Calcula la suma de los números entre A y B (inclusive)
     * @param a límite inferior
     * @param b límite superior
     * @return la suma
     */
    int calcularSumaEntreAyB(int a, int b);

    /**
     * Calcula el promedio de los números entre A y B (inclusive)
     * @param a límite inferior
     * @param b límite superior
     * @return el promedio
     */
    double calcularPromedioEntreAyB(int a, int b);

    /**
     * Calcula la suma de un arreglo de números
     * @param numeros arreglo de números a sumar
     * @return la suma
     */
    double calcularSumaDeNumeros(double[] numeros);
}