package cz.vutbr.feec.utko.ttin.cviko4.exam1;

/**
 * Created by ogajduse on 2/28/17.
 */
public class MyNode {
    private int data;
    private MyNode nasledujici;

    public MyNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public MyNode getNasledujici() {
        return nasledujici;
    }

    public void setNasledujici(MyNode nasledujici) {
        this.nasledujici = nasledujici;
    }
}
