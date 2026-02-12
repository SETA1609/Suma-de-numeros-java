# Suma-de-numeros-java
Programa para el parcial numero 1 Uni-Remington

## Estructura del Proyecto

Este proyecto contiene tres archivos Java:

1. **OperacionesSumas.java** - Interfaz con las firmas de métodos
2. **SumasImplementacion.java** - Clase que implementa la interfaz
3. **Main.java** - Clase principal con el punto de entrada

## Cómo Compilar

```bash
javac OperacionesSumas.java SumasImplementacion.java Main.java
```

## Cómo Ejecutar

```bash
java Main
```

## Funcionalidad

El programa ejecuta tres operaciones en secuencia:

1. **Suma del 1 al 25** - Calcula la suma usando la fórmula de Gauss: `n(n+1)/2`
2. **Suma y promedio entre A y B** - Pide dos números por teclado y calcula la suma y el promedio de los enteros en ese rango
3. **Suma indeterminada** - Permite sumar números decimales de forma acumulada hasta que el usuario decida parar

Al finalizar las tres operaciones, el programa pregunta si se desea repetir el ciclo completo o terminar.
