/**
 * Interface for sum of numbers operations
 */
public interface ISumaNumeros {
    /**
     * Sum two numbers
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    int sumar(int a, int b);
    
    /**
     * Show menu to user
     */
    void mostrarMenu();
    
    /**
     * Process user option
     * @param opcion User's choice
     */
    void procesarOpcion(int opcion);
    
    /**
     * Exit the program
     * This function should change the RUNNING value
     */
    void salir();
    
    /**
     * Check if the program is still running
     * @return true if running, false otherwise
     */
    boolean isRunning();
}
