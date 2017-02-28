package cz.vutbr.feec.utko.ttin.cviko3.exam1;

/**
 * Created by ogajduse on 2/21/17.
 */
public class Kruh extends Tvar {

    private final int r;

    public Kruh(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void vykresli() {
        /*sout*/
        System.out.println("vypisujeme kruh na souradnicich: " + x +" " + y + " s polomerem " + this.r);
    }
}
