import java.util.*;

public class Grafico<V> {
    
    private Map<V, Set<V>> proximidadList = new HashMap<>();

    public boolean addVertice(V v) {
        if (!proximidadList.containsKey(v)) {
            proximidadList.put(v, new HashSet<V>());
            return true;
        }
        return false;
    }

    public boolean addArista(V v1, V v2) {
        addVertice(v1);
        addVertice(v2);
        return proximidadList.get(v1).add(v2);
    }

    public Set<V> obtainAdjacentes(V v) throws Exception {
        if (!proximidadList.containsKey(v)) {
            throw new Exception("El vertice no se encuentra en el grafico");
        }
        return proximidadList.get(v);
    }

    public boolean containsVertice(V v) {
        return proximidadList.containsKey(v);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (V v : proximidadList.keySet()) {
            sb.append(v.toString() + ": ");
            for (V adj : proximidadList.get(v)) {
                sb.append(adj.toString() + " ");
            }
            sb.append("\n");
        }
       



