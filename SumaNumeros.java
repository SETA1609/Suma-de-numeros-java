import java.util.Scanner;

/**
 * Implementation of ISumaNumeros interface
 */
public class SumaNumeros implements ISumaNumeros {
    private Scanner scanner;
    private boolean running;
    
    public SumaNumeros(Scanner scanner) {
        this.scanner = scanner;
        this.running = true;
    }
    
    @Override
    public int sumar(int a, int b) {
        return a + b;
    }
    
    @Override
    public void mostrarMenu() {
        System.out.println("\n=== SUMA DE NUMEROS ===");
        System.out.println("1. Sumar dos numeros");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opcion: ");
    }
    
    @Override
    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el primer numero: ");
                int num1 = scanner.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                int num2 = scanner.nextInt();
                int resultado = sumar(num1, num2);
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                salir();
                break;
            default:
                System.out.println("Opcion invalida. Por favor intente de nuevo.");
                break;
        }
    }
    
    @Override
    public void salir() {
        System.out.println("Saliendo del programa...");
        this.running = false;
    }
    
    public boolean isRunning() {
        return running;
    }
}
