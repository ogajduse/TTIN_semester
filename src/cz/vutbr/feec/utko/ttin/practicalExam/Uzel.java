package cz.vutbr.feec.utko.ttin.practicalExam;

/**
 * Created by ogajduse on 5/2/17.
 */
public class Uzel {
    private int barva;
    private int data;
    private Uzel next;

    public Uzel(int data, int barva) {
        this.data = data;
        this.barva = barva;
    }

    public Uzel(Uzel uzel) {
        this.data = uzel.data;
        this.barva = uzel.barva;
        this.next = uzel.next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Uzel getNext() {
        return next;
    }

    public void setNext(Uzel nasledujici) {
        this.next = nasledujici;
    }

    public int getBarva() {
        return barva;
    }
}
