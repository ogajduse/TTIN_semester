package cz.vutbr.feec.utko.ttin.cviko12.rekurze_ve_strome;

/**
 * Created by ogajduse on 4/25/17.
 */
public class Executable {
    public static void main(String[] args) {
        Uzel um1 = new Uzel(-1, null, null);
        Uzel u3spodni = new Uzel(3, null, null);
        Uzel u6 = new Uzel(6, um1, u3spodni);
        Uzel u3 = new Uzel(3, null, null);
        Uzel u1 = new Uzel(1, u6, u3);

        System.out.println(u1.secti());
    }
}
