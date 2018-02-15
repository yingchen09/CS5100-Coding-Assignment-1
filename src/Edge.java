/**
 * Created by yingchen on 2018/2/10.
 */
public class Edge {
    private int toNode;
    private int weight;

    public Edge(int toNode, int weight) {
        this.toNode = toNode;
        this.weight = weight;
    }

    public int getToNode() {
        return toNode;
    }

    public int getWeight() {
        return weight;
    }
}
