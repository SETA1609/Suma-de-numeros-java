import java.util.Scanner;

/**
 * Main class - Entry point of the application
 */
public class Main {
    private static boolean RUNNING = true;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumaNumeros suma = new SumaNumeros(scanner);
        
        System.out.println("Bienvenido al programa de Suma de Numeros");
        
        // While loop controlled by RUNNING variable
        while (RUNNING) {
            suma.mostrarMenu();
            
            if (scanner.hasNextInt()) {
                int opcion = scanner.nextInt();
                suma.procesarOpcion(opcion);
                
                // Update RUNNING based on suma's running state
                // The salir() function in suma changes its internal state
                RUNNING = suma.isRunning();
            } else {
                System.out.println("Por favor ingrese un numero valido.");
                scanner.next(); // Clear invalid input
            }
        }
        
        scanner.close();
        System.out.println("Programa finalizado.");
    }
}
