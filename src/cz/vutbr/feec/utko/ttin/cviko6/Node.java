package cz.vutbr.feec.utko.ttin.cviko6;

import java.util.LinkedList;

/**
 * Created by ogajduse on 3/13/17.
 */
public class Node {
    public static final int INFINITY = 99999;
    private LinkedList<Edge> neighbours = new LinkedList<>();
    private String value;

    public Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LinkedList<Edge> getNeighbours() {
        return neighbours;
    }

    @Deprecated
    public void addNeighbour(Node u, int cost) {
        for (Edge edge : neighbours) {
            if (!(edge.getLeft() == this) ? u == edge.getLeft() : u == edge.getRight() ||
                    !(this == edge.getRight()) ? u == edge.getRight() : u == edge.getLeft()) {
                System.out.println("This node already has exactly such a neighbor.");
                return;
            }
            neighbours.add(new Edge(this, u, cost));
        }
    }

    public void addEdge(Edge newEdge) {
        neighbours.add(newEdge);
    }

    public int getCost(Node u) {
        for (Edge edge : neighbours) {
            if (edge.getLeft() == u || edge.getRight() == u) {
                return edge.getCost();
            }
        }
        return INFINITY;
    }

    public int getNeighboursCount() {
        int counter = 0;
        for (Edge edge : neighbours) {
            counter++;
        }
        return counter;
    }

}

