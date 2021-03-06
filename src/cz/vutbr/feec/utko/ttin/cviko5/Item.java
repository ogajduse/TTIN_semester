package cz.vutbr.feec.utko.ttin.cviko5;

/**
 * Created by ogajduse on 3/4/17.
 */
public class Item<T extends Comparable<T>> {
    private T data;
    private Item<T> left;
    private Item<T> right;
    private Item<T> parent;

    public Item(T data, Item<T> parent) {
        this.data = data;
        this.parent = parent;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Item<T> getParent() {
        return parent;
    }

    public void setParent(Item<T> parent) {
        this.parent = parent;
    }

    public Item<T> getLeft() {
        return left;
    }

    public void setLeft(Item<T> left) {
        this.left = left;
    }

    public Item<T> getRight() {
        return right;
    }

    public void setRight(Item<T> right) {
        this.right = right;
    }

    public boolean isLeftEmpty() {
        return this.left == null;
    }

    public boolean isLeftEmpty(Item<T> item) {
        return item.getLeft() == null;
    }

    public boolean isRightEmpty() {
        return this.right == null;
    }

    public boolean isRightEmpty(Item<T> item) {
        return item.getRight() == null;
    }

}
