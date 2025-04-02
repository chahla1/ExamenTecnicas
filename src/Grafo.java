//Ejercicio 3
import java.util.*;

import java.util.*;

public class Grafo {
    private Map<Integer, List<Integer>> adjList; // Lista de adyacencia para representar el grafo

    // Constructor que inicializa la lista de adyacencia
    public Grafo() {
        this.adjList = new HashMap<>();
    }

    // Metodo para agregar una arista entre dos nodos
    public void agregarArista(int origen, int destino) {
        adjList.putIfAbsent(origen, new ArrayList<>());
        adjList.putIfAbsent(destino, new ArrayList<>());
        adjList.get(origen).add(destino);
    }

    // Metodo para buscar un ciclo en el grafo con una profundidad maxima
    public List<Integer> buscarCiclo(int maxProfundidad) {
        Set<Integer> visitados = new HashSet<>();
        List<Integer> camino = new ArrayList<>();
        for (Integer nodo : adjList.keySet()) {
            if (dfs(nodo, visitados, camino, nodo, 0, maxProfundidad)) {
                return camino;
            }
        }
        return Collections.emptyList(); // Retorna una lista vacia si no se encuentra ciclo
    }

    // Metodo privado para realizar una busqueda en profundidad (DFS)
    private boolean dfs(int nodoActual, Set<Integer> visitados, List<Integer> camino, int nodoInicio, int profundidad, int maxProfundidad) {
        visitados.add(nodoActual);
        camino.add(nodoActual);

        if (profundidad >= maxProfundidad) {
            visitados.remove(nodoActual);
            camino.remove(camino.size() - 1);
            return false;
        }

        for (Integer vecino : adjList.get(nodoActual)) {
            if (vecino.equals(nodoInicio) && camino.size() > 1) {
                camino.add(nodoInicio);
                return true;
            }
            if (!visitados.contains(vecino)) {
                if (dfs(vecino, visitados, camino, nodoInicio, profundidad + 1, maxProfundidad)) {
                    return true;
                }
            }
        }

        visitados.remove(nodoActual);
        camino.remove(camino.size() - 1);
        return false;
    }


}