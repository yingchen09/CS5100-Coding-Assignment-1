import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by yingchen on 2018/2/9.
 */
public class Graph {
    private int V;
    private int E;
    private Map<String, Integer> map = new HashMap<>();
    private List<Edge>[] adj;

    private void transfer(List<String> Nodes) {
        for (int i = 0; i < Nodes.size(); i++) {
            map.put(Nodes.get(i), i);
        }
    }

    /**
     * Initializes an empty digraph with V vertices.
     *
     * @param Nodes a list of nodes
     * @param Arcs a list of Arcs between nodes to create the graph
     * @throws IllegalArgumentException if {@code V < 0}
     */
    public Graph(List<String> Nodes, List<Arc> Arcs) throws IllegalArgumentException {
        transfer(Nodes);
        this.V = Nodes.size();
        this.E = Arcs.size();
        this.adj = (List<Edge>[]) new LinkedList[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<Edge>();
        }
        for (Arc arc : Arcs) {
            String fromNode = arc.getFromNode();
            String toNode = arc.getToNode();
            if (!Nodes.contains(fromNode) || !Nodes.contains(fromNode)) {
                throw new IllegalArgumentException("Some of the given Arcs do not belong to " +
                        "the given Nodes!");
            } else {
                int v = map.get(fromNode);
                int w = map.get(toNode);
                int weight = arc.getWeight();
                Edge e = new Edge(w, weight);
                adj[v].add(e);
            }
        }
    }

    /**
     * Returns the number of vertices in this digraph.
     *
     * @return the number of vertices in this digraph
     */
    public int getV() {
        return V;
    }

    /**
     * Returns the number of edges in this digraph.
     *
     * @return the number of edges in this digraph
     */
    public int getE() {
        return E;
    }

    public List<Edge>[] getAdj() {
        return adj;
    }

    public Map<String, Integer> getMap() {
        return map;
    }
}
