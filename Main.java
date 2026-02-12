import java.util.Scanner;

/**
 * Main class - Entry point of the application
 */
public class Main {
    private static boolean RUNNING = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Aquí usamos la interfaz como tipo de variable
        // Esto permite cambiar la implementación sin tocar el main
        OperacionesSumas operaciones = new SumasImplementacion();

        boolean running = true;

        while (running) {
            operaciones.ejecutarSuma1al25();

            operaciones.ejecutarSumaYPromedioEntreAyb(sc);

            // La funcion 3 devuelve true/false para controlar el bucle
            running = operaciones.ejecutarSumaIndeterminada(sc);
        }

        System.out.println("\n¡Gracias por usar el programa! Adiós.");
        sc.close();
    }
}
