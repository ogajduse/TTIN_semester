package cz.vutbr.feec.utko.ttin.cviko5;

/**
 * Created by ogajduse on 3/4/17.
 */
public class BinarySearchTree<T extends Comparable<T>> {
    private Item<T> root;

//    public Item<T> search(Item<T> input) {
//
//    }

    public void del(Item<T> input) {

    }

    public boolean contains(T value) {
        Item<T> pointer = this.root;
        while (pointer != null) {
            if (pointer.getData() == value) {
                return true;
            }
            if (value.compareTo(pointer.getData()) < 0) {
                pointer = pointer.getLeft();
            } else {
                pointer = pointer.getRight();
            }
        }
        return false;

    }

    public void vypis() {
        inOrder(this.root);
    }

    private void inOrder(Item<T> input) {
        if (input == null) {
            return;
        }
        inOrder(input.getLeft());
        System.out.println(input.getData());
        inOrder(input.getRight());
    }

    public Item<T> add(T input, Item<T> item) {
        if (item == null) {
            return new Item<T>(input, null);
        }
        if (input.compareTo(item.getData()) < 0) {
            item.setLeft(add(input, item.getLeft()));
        } else {
            item.setRight(add(input, item.getRight()));
        }
        return item;
    }

    public Item<T> add(T input) {
        if (this.root != null) {
            return add(input, this.root);
        } else {
            return this.root = new Item<T>(input, null);
        }
    }
}
