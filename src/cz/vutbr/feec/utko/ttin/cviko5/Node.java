package cz.vutbr.feec.utko.ttin.cviko5;

/**
 * Created by ogajduse on 3/4/17.
 */
public class Node<T> {
    T data;
    private Node<T> left;
    private Node<T> right;
    private Node<T> parrent;

    public Node(T data, Node<T> parrent) {
        this.data = data;
        this.parrent = parrent;
    }

    public T getData() {
        return data;
    }

    public Node<T> getParrent() {
        return parrent;
    }

    public void setParrent(Node<T> parrent) {
        this.parrent = parrent;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public boolean isLeftEmpty() {
        return this.left == null;
    }

    public boolean isLeftEmpty(Node<T> node) {
        return node.getLeft() == null;
    }

    public boolean isRightEmpty() {
        return this.right == null;
    }

    public boolean isRightEmpty(Node<T> node) {
        return node.getRight() == null;
    }
}
