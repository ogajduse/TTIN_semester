package cz.vutbr.feec.utko.ttin.cviko3;

/**
 * Created by ogajduse on 2/21/17.
 */
public class Ctverec extends Tvar {

    private int d;

    public Ctverec(int x, int y , int d) {
        this.x = x;
        this.y = x;
        this.d = d;
    }

    @Override
    public void vykresli(){
        System.out.println("vypisujeme ctverec na souradnicich: " + x +" " + y + "o strane " + this.d);
    }

}
