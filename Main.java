public class Main {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<>();

        // Añadimos algunos vértices y arcos al grafo
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        // Añade algunos arcos
        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "D");
        graph.addEdge("D", "A");

        // Mostramos la lista de adyacencia del grafo
        System.out.println(grafo.toString());

        // Obtenemos los adyacentes al vértice "A"
        try {
            System.out.println("Adyacentes a A: " + grafo.obtainAdjacentes("A"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

