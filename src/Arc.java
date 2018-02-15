/**
 * Created by yingchen on 2018/2/9.
 */
public class Arc {
    private String fromNode;
    private String toNode;
    private int weight;

    /**

     **/
    public Arc(String fromNode, String toNode, int weight) {
        this.fromNode = fromNode;
        this.toNode = toNode;
        this.weight = weight;
    }

    public String getFromNode() {
        return fromNode;
    }

    public String getToNode() {
        return toNode;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Arc arc = (Arc) o;

        if (weight != arc.weight) return false;
        if (!fromNode.equals(arc.fromNode)) return false;
        return toNode.equals(arc.toNode);
    }

    @Override
    public int hashCode() {
        int result = fromNode.hashCode();
        result = 31 * result + toNode.hashCode();
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "Arc{" +
                "fromNode='" + fromNode + '\'' +
                ", toNode='" + toNode + '\'' +
                ", weight=" + weight +
                '}';
    }
}
