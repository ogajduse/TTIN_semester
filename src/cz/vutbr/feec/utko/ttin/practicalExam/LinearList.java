package cz.vutbr.feec.utko.ttin.practicalExam;

/**
 * Created by ogajduse on 5/2/17.
 */

public class LinearList {
    private Uzel head;
    private int count;

    public LinearList() {
        this.head = null;
        this.count = 0;
    }

    public int pridejNaZacatek(int data, int color) {
        if (this.head != null) {
            Uzel newNode = new Uzel(data, color);
            newNode.setNext(head);
            this.head = newNode;
        } else {
            this.head = new Uzel(data, color);
        }
        count++;
        return 0;
    }

    public int getCount() {
        return count;
    }

    public Uzel odstranZeZacatku() {
        Uzel retval = this.head;
        this.head = head.getNext();
        count--;
        return retval;
    }

    public boolean odstranBarvu(int barva) {
        while (this.head.getBarva() == barva) {
            odstranZeZacatku();
        }
        Uzel testovany = this.head;
        boolean retval = false;
        if (this.head.getBarva() == barva){
            odstranZeZacatku();
        }
        while (testovany.getNext() != null) {
            if (testovany.getNext().getBarva() == barva) {
                testovany.setNext(testovany.getNext().getNext());
                count--;
                retval = true;
                continue;
            }
                testovany = testovany.getNext();
        }
        return retval;
    }
}
