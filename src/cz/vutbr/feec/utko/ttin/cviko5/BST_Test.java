package cz.vutbr.feec.utko.ttin.cviko5;

/**
 * Created by ogajduse on 3/4/17.
 */
public class BST_Test {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(4);
        tree.add(3);
        tree.add(5);
        tree.add(2);

        System.out.println(tree.contains(4));
        System.out.println(tree.contains(3));
        System.out.println(tree.contains(8));


    }
}
