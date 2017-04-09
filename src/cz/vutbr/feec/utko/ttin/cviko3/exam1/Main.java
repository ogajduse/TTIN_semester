package cz.vutbr.feec.utko.ttin.cviko3.exam1;

/**
 * Created by ogajduse on 2/21/17.
 */
public class Main {
    public static void main(String[] args) {
        Kruh k1 = new Kruh(1, 2, 5);
        Kruh k2 = new Kruh(1, 2, 5);
        Ctverec c1 = new Ctverec(5, 5, 9);
        Slozenina s = new Slozenina(10, 10);

        s.pridej(new Kruh(20, 20, 5));
        s.pridej(new Ctverec(50, 20, 5));

        k1.vykresli();
        c1.vykresli();

        s.vykresli();
    }
}
