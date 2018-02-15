import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Created by yingchen on 2018/2/13.
 */
public class Bfs implements SearchStrategizer {

    @Override
    public List<List<Integer>> search(Graph graph, String StartNode, String SearchStrategy, String Goal) throws IllegalArgumentException {
        Map<String, Integer> map = graph.getMap();
        if (!map.containsKey(StartNode) || !map.containsKey(Goal)) {
            throw new IllegalArgumentException("Start node or Goal is not in the graph!");
        }
        int source = map.get(StartNode);
        int des = map.get(Goal);
        List<List<Integer>> res = new ArrayList<>();
        bfs(graph, source, des, res);

        return res;
    }

    private void bfs(Graph graph, int source, int des, List<List<Integer>> res) {
        List<Edge>[] edges = graph.getAdj();
        Queue<Integer> q = new LinkedList<>();
        Queue<List<Integer>> q2= new LinkedList<>();
        boolean[] visited = new boolean[graph.getV()];
        q.add(source);
        q2.add(new ArrayList<Integer>(Arrays.asList(source)));
        while (!q.isEmpty()) {
            int v = q.poll();
            List<Integer> sublist = q2.poll();
            if (v == des) {
                res.add(sublist);
            }
            List<Edge> toNodes = edges[v];
            visited[v] = true;
            for (Edge w : toNodes) {
                int w2 = w.getToNode();
                if(!visited[w2]) {
                    q.add(w2);
                    sublist.add(w2);
                    q2.add(sublist);
                }
            }
        }
    }
}
