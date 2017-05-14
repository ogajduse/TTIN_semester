package cz.vutbr.feec.utko.ttin.cviko6;

/**
 * Created by ogajduse on 3/14/17.
 */
public class Edge {
    private Node left;
    private Node right;
    private int cost;

    public Edge(Node left, Node right, int cost) {
        this.left = left;
        this.right = right;
        this.cost = cost;
    }

    public Node getSoused(Node asking) {
        if (left != asking && right == asking) {
            return left;
        }
        if (right != asking && left == asking) {
            return right;
        }
        return null;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


}
