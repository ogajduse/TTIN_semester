package cz.vutbr.feec.utko.ttin.cviko6;

/**
 * Created by ogajduse on 3/13/17.
 */
public class Executable {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge("1", "6", 6);
        g.addEdge("1", "2", 4);
        g.addEdge("1", "7", 16);
        g.addEdge("2", "3", 24);
        g.addEdge("6", "3", 23);
        g.addEdge("6", "7", 8);
        g.addEdge("6", "5", 5);
        g.addEdge("7", "5", 10);
        g.addEdge("7", "8", 21);

        Path c = new Path(g);
        c.addNode("1");
        c.addNode("6");
        c.addNode("5");

        c.getCost();
        System.out.println(c.getCost());
    }

}
