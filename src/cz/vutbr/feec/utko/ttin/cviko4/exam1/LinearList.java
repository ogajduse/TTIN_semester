package cz.vutbr.feec.utko.ttin.cviko4.exam1;

/**
 * Created by ogajduse on 2/28/17.
 */
public class LinearList {
    private MyNode head;
    private int count;

    public LinearList() {
        this.head = null;
        this.count = 0;
    }

    public int pridejNaZacatek(int input) {
        if (this.head != null) {
            MyNode newNode = new MyNode(input);
            newNode.setNasledujici(head);
            this.head = newNode;
        } else {
            this.head = new MyNode(input);
        }
        count++;
        return 0;
    }

    public int getCount() {
        return count;
    }

    public MyNode odstranZeZacatku() {
        MyNode retval = this.head;
        this.head = head.getNasledujici();
        count--;
        return retval;
    }

    public boolean obsahuje(int query) {
        MyNode testovany = this.head;
        while (testovany != null) {
            if (testovany.getData() == query) {
                return true;
            }
            testovany = testovany.getNasledujici();
        }
        return false;
    }


}
