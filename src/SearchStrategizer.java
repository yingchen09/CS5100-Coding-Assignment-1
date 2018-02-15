import java.util.List;

/**
 * Created by yingchen on 2018/2/13.
 */
public interface SearchStrategizer {
    public List<List<Integer>> search(Graph graph, String StartNode, String SearchStrategy, String Goal) throws IllegalArgumentException;
}

