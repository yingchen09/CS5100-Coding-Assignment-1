import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yingchen on 2018/2/13.
 */
public class Initializer {
    public static Graph initializeGraph() throws IllegalArgumentException {
        List<String> Nodes = new ArrayList<>(Arrays.asList("mail", "ts", "o103", "o109", "o111",
                "b1", "b2", "b3", "b4", "c1", "c2", "c3", "d1", "d2", "d3", "o125", "o123", "o119", "r123", "storage"));

        List<Arc> Arcs = new ArrayList<>();
        Arc a1 = new Arc("ts","mail",6);
        Arc b1 = new Arc("mail","ts",6);
        Arc c1 = new Arc("o103","ts",8);
        Arc d1 = new Arc("o103","b3",4);
        Arc e1 = new Arc("o103","o109",12);
        Arc f1 = new Arc("o109","o103",12);
        Arc g1 = new Arc("o109","o119",16);
        Arc h1 = new Arc("o119","o109",16);
        Arc i1 = new Arc("o109","o111",4);
        Arc j1 = new Arc("o111","o109",4);
        Arc k1 = new Arc("b1","c2",3);
        Arc l1 = new Arc("b1","b2",6);
        Arc m1 = new Arc("b2","b1",6);
        Arc n1 = new Arc("b2","b4",3);
        Arc o1 = new Arc("b4","b2",3);
        Arc p1 = new Arc("b3","b1",4);
        Arc q1 = new Arc("b1","b3",4);
        Arc r1 = new Arc("b3","b4",7);
        Arc s1 = new Arc("b4","b3",7);
        Arc t1 = new Arc("b4","o109",7);
        Arc u1 = new Arc("c1","c3",8);
        Arc v1 = new Arc("c3","c1",8);
        Arc w1 = new Arc("c2","c3",6);
        Arc x1 = new Arc("c3","c2",6);
        Arc y1 = new Arc("c2","c1",4);
        Arc z1 = new Arc("c1","c2",4);
        Arc a2 = new Arc("d1","d3",8);
        Arc b2 = new Arc("d3","d1",8);
        Arc c2 = new Arc("o125","d2",2);
        Arc d2 = new Arc("d2","o125",2);
        Arc e2 = new Arc("o123","o125",4);
        Arc f2 = new Arc("o125","o123",4);
        Arc g2 = new Arc("o123","r123",4);
        Arc h2 = new Arc("r123","o123",4);
        Arc i2 = new Arc("o119","o123",9);
        Arc j2 = new Arc("o123","o119",9);
        Arc k2 = new Arc("o119","storage",7);
        Arc l2 = new Arc("storage","o119",7);

        Arcs.addAll(Arrays.asList(a1,b1,c1,d1,e1,f1,g1,h1,i1,j1,k1,l1,m1,n1,o1,p1,q1,r1,s1,t1,u1,v1,w1,x1,y1,z1,a2,b2,c2,d2,e2,f2,g2,h2,i2,j2,k2,l2));

        Graph graph = new Graph(Nodes, Arcs);
        return graph;
    }
}
