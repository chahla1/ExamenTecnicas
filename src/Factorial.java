//Ejercicio 6
public class Factorial {

    // Método recursivo para calcular el factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Método para calcular el factorial utilizando programación dinámica
    public static long factorialDin(int n) {
        // Crear una tabla de valores para almacenar los resultados intermedios
        long[] tabla = new long[n + 1];

        // Inicializar los valores base del factorial
        tabla[0] = 1;
        if (n > 0) {
            tabla[1] = 1;
        }

        // Rellenar la tabla con los valores factoriales desde 2 hasta n
        for (int i = 2; i <= n; i++) {
            tabla[i] = i * tabla[i - 1];
        }

        // Devolver el valor factorial almacenado en la posición n de la tabla
        return tabla[n];
    }
}