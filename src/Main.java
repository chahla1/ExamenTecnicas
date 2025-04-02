import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Para calcular el factorial de un numero utilizando el algoritmo dinamico
        int numeroParaFactorial = 5;
        long factorialResultado = factorialDin(numeroParaFactorial);
        System.out.println("Factorial de " + numeroParaFactorial + " es: " + factorialResultado);

        // 7. Resolver el problema de las Torres de Hanoi para un numero de discos
        int numeroDeDiscos = 3;
        System.out.println("Resolver Torres de Hanoi con " + numeroDeDiscos + " discos:");
        TorresDeHanoi.resolverHanoi(numeroDeDiscos, "P1", "P2", "P3");

        // 3. Crear un grafo, agregar aristas, y buscar un ciclo con una profundidad maxima
        Grafo grafo = new Grafo();
        grafo.agregarArista(1, 2);
        grafo.agregarArista(2, 3);
        grafo.agregarArista(3, 4);
        grafo.agregarArista(4, 2); // Crea un ciclo que pasa del 2 al 3 al 4 al 2

        int maxProfundidadCiclo = 4;
        List<Integer> ciclo = grafo.buscarCiclo(maxProfundidadCiclo);
        if (!ciclo.isEmpty()) {
            System.out.println("Ciclo encontrado: " + ciclo);
        } else {
            System.out.println("No se encontró ciclo.");
        }
    }

    // implementamos el metodo factorialDin
    public static long factorialDin(int n) {
        long[] tabla = new long[n + 1];
        tabla[0] = 1;
        if (n > 0) {
            tabla[1] = 1;
        }
        for (int i = 2; i <= n; i++) {
            tabla[i] = i * tabla[i - 1];
        }
        return tabla[n];
    }
}