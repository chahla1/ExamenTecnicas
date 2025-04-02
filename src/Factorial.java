//Ejercicio 6
public class Factorial {

    // metodo para calcular el factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // metodo utilizando programacion dinamica
    public static long factorialDin(int n) {
        // creamos una tabla de valores
        long[] tabla = new long[n + 1];

        // Inicializamos los valores base del factorial
        tabla[0] = 1;
        if (n > 0) {
            tabla[1] = 1;
        }

        // Rellenamos la tabla con los valores factoriales desde 2 hasta n
        for (int i = 2; i <= n; i++) {
            tabla[i] = i * tabla[i - 1];
        }

        // Devolvemos el valor factorial almacenado en la posicion n de la tabla
        return tabla[n];
    }
}