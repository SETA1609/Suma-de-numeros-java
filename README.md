# Suma-de-numeros-java
Programa para el parcial numero 1 Uni-Remington

## Estructura del Proyecto

Este proyecto contiene los siguientes archivos:

1. **OperacionesSumas.java** - Interfaz con las firmas de métodos
2. **SumasImplementacion.java** - Clase que implementa la interfaz
3. **Main.java** - Clase principal con el punto de entrada
4. **SumasImplementacionTest.java** - Tests E2E con JUnit 5
5. **.github/workflows/test.yml** - CI con GitHub Actions para ejecutar los tests

## Cómo Compilar

```bash
javac OperacionesSumas.java SumasImplementacion.java Main.java
```

## Cómo Ejecutar

```bash
java Main
```

## Cómo Ejecutar los Tests

Requiere JUnit Platform Console Standalone:

```bash
curl -L -o junit-platform-console-standalone.jar \
  https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.10.2/junit-platform-console-standalone-1.10.2.jar
javac -cp junit-platform-console-standalone.jar *.java
java -jar junit-platform-console-standalone.jar --class-path . --scan-class-path --fail-if-no-tests
```

Los tests también se ejecutan automáticamente en cada push/PR a `main` mediante GitHub Actions.

## Funcionalidad

El programa ejecuta tres operaciones en secuencia:

1. **Suma del 1 al 25** - Calcula la suma usando la fórmula de Gauss: `n(n+1)/2`
2. **Suma y promedio entre A y B** - Pide dos números por teclado y calcula la suma y el promedio de los enteros en ese rango
3. **Suma indeterminada** - Permite sumar números decimales de forma acumulada hasta que el usuario decida parar

Al finalizar las tres operaciones, el programa pregunta si se desea repetir el ciclo completo o terminar.

## Pseudocódigo

### Main

```
INICIO
    crear scanner
    crear operaciones = nueva SumasImplementacion()
    running = verdadero

    MIENTRAS running
        operaciones.ejecutarSuma1al25()
        operaciones.ejecutarSumaYPromedioEntreAyb(scanner)
        running = operaciones.ejecutarSumaIndeterminada(scanner)
    FIN MIENTRAS

    imprimir "¡Gracias por usar el programa! Adiós."
    cerrar scanner
FIN
```

### OperacionesSumas (Interfaz)

```
INTERFAZ OperacionesSumas
    ejecutarSuma1al25()
    ejecutarSumaYPromedioEntreAyb(scanner)
    ejecutarSumaIndeterminada(scanner) -> booleano
FIN INTERFAZ
```

### SumasImplementacion

```
CLASE SumasImplementacion IMPLEMENTA OperacionesSumas

    FUNCIÓN ejecutarSuma1al25()
        n = 25
        suma = n * (n + 1) / 2
        imprimir suma
    FIN FUNCIÓN

    FUNCIÓN ejecutarSumaYPromedioEntreAyb(scanner)
        leer a
        leer b

        inicio = min(a, b)
        fin = max(a, b)

        suma = fin*(fin+1)/2 - (inicio-1)*inicio/2
        cantidad = fin - inicio + 1
        promedio = suma / cantidad

        imprimir suma
        imprimir promedio
    FIN FUNCIÓN

    FUNCIÓN ejecutarSumaIndeterminada(scanner) -> booleano
        suma = 0.0
        continuar = verdadero

        MIENTRAS continuar
            leer numero
            suma = suma + numero
            imprimir suma

            leer respuesta
            SI respuesta == "n" ENTONCES
                continuar = falso
            FIN SI
        FIN MIENTRAS

        leer respuesta
        SI respuesta == "s" ENTONCES
            RETORNAR verdadero
        SINO
            RETORNAR falso
        FIN SI
    FIN FUNCIÓN

FIN CLASE
```
