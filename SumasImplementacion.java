import java.util.Scanner;

public class SumasImplementacion implements OperacionesSumas {

    @Override
    public void ejecutarSuma1al25() {
        System.out.println("=== Función 1: Suma de los números del 1 al 25 ===");
        int n = 25;
        int suma = n * (n + 1) / 2;
        System.out.println("Aplicando la fórmula de Gauss: suma = n(n+1)/2");
        System.out.println("Resultado: " + suma + "\n");
    }

    @Override
    public void ejecutarSumaYPromedioEntreAyb(Scanner sc) {
        System.out.println("=== Función 2: Suma y promedio entre A y B ===");
        System.out.print("Ingrese el valor de A: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el valor de B: ");
        int b = sc.nextInt();

        int inicio = Math.min(a, b);
        int fin = Math.max(a, b);

        int sumaHastaFin = fin * (fin + 1) / 2;
        int sumaHastaInicioMenos1 = (inicio - 1) * inicio / 2;
        int suma = sumaHastaFin - sumaHastaInicioMenos1;

        int cantidad = fin - inicio + 1;
        double promedio = (double) suma / cantidad;

        System.out.println("Suma de los números entre " + inicio + " y " + fin + ": " + suma);
        System.out.println("Promedio: " + promedio + "\n");
    }

    @Override
    public boolean ejecutarSumaIndeterminada(Scanner sc) {
        System.out.println("=== Función 3: Suma de números indeterminados ===");
        System.out.println("Ingrese números (pueden ser decimales). Después de cada uno se mostrará la suma acumulada.\n");

        double suma = 0.0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese un número: ");
            double numero = sc.nextDouble();
            suma += numero;
            System.out.println("Suma actual: " + suma);

            System.out.print("¿Desea ingresar otro número? (s/n): ");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        // Pregunta final para repetir el programa
        System.out.print("\n¿Desea repetir todo el programa desde la primera función? (s/n): ");
        String resp = sc.next();
        if (resp.equalsIgnoreCase("s")) {
            System.out.println("¡Perfecto! Reiniciando el ciclo...\n");
            return true;
        } else {
            System.out.println("Entendido. Finalizando el programa.\n");
            return false;
        }
    }
}