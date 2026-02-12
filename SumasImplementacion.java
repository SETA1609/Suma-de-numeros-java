import java.util.Scanner;

public class SumasImplementacion implements OperacionesSumas {

    @Override
    public void ejecutarSuma1al25() {
        System.out.println("=== Función 1: Suma de los números del 1 al 25 ===");
        int suma = calcularSuma1al25();
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

        // Aseguramos a <= b
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
            System.out.println("Nota: A era mayor que B → se intercambiaron automáticamente.");
        }

        int suma = calcularSumaEntreAyB(a, b);
        double promedio = calcularPromedioEntreAyB(a, b);

        System.out.println("Suma de los números entre " + a + " y " + b + ": " + suma);
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

    @Override
    public int calcularSuma1al25() {
        int n = 25;
        return n * (n + 1) / 2;
    }

    @Override
    public int calcularSumaEntreAyB(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int sumaHastaB = b * (b + 1) / 2;
        int sumaHastaAMenos1 = (a - 1) * a / 2;
        return sumaHastaB - sumaHastaAMenos1;
    }

    @Override
    public double calcularPromedioEntreAyB(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int suma = calcularSumaEntreAyB(min, max);
        int cantidad = max - min + 1;
        return (double) suma / cantidad;
    }

    @Override
    public double calcularSumaDeNumeros(double[] numeros) {
        double suma = 0.0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma;
    }
}