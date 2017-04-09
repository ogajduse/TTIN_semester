package cz.vutbr.feec.utko.ttin.cviko6;

/**
 * Created by ogajduse on 3/13/17.
 */
public class Executable {
    public static void main(String[] args) {
        Graf g = new Graf();
        g.pridejHranu("1", "6", 6);
        g.pridejHranu("1", "2", 4);
        g.pridejHranu("1", "7", 16);
        g.pridejHranu("2", "3", 24);
        g.pridejHranu("6", "3", 23);
        g.pridejHranu("6", "7", 8);
        g.pridejHranu("6", "5", 5);
        g.pridejHranu("7", "5", 10);
        g.pridejHranu("7", "8", 21);

        Cesta c = new Cesta(g);
        c.pridejUzel("1");
        c.pridejUzel("6");
        c.pridejUzel("5");

        c.getCena();
        System.out.println(c.getCena());
    }

}
