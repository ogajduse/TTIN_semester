package cz.vutbr.feec.utko.ttin.cviko6;

import java.util.Vector;

/**
 * Created by ogajduse on 3/14/17.
 */
public class Path implements Comparable<Path> {
    private Graph g;
    private Node lastNode = null;
    private Vector<Node> nodes = new Vector<>();
    private int cost;

    public Path(Graph g) {
        this.g = g;
    }

    public void addNode(String s) {
        Node node = g.findNode(s);
        if (lastNode == null) {
            cost = 0;
        } else {
            cost += lastNode.getCost(node);
        }
        lastNode = node;
        nodes.add(node);
    }


    public Node getLastNode() {
        return lastNode;
    }

    public int getCost() {
        return cost;
    }

    public boolean isAtDestination(String destination) {
        if (lastNode == null) {
            return false;
        } else {
            return destination.equals(lastNode.getValue());
        }
    }

    public Path cloneAndAdd(String value) {
        Path copy = new Path(g);
        copy.lastNode = lastNode;
        copy.cost = cost;
        copy.nodes.addAll(nodes);

        copy.addNode(value);
        return copy;

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Path path) {
        Integer c1 = cost;
        Integer c2 = path.getCost();
        return c1.compareTo(c2);
    }
}
