package cz.vutbr.feec.utko.ttin.cviko9;

import cz.vutbr.feec.utko.ttin.cviko6.Cesta;
import cz.vutbr.feec.utko.ttin.cviko6.Graf;
import cz.vutbr.feec.utko.ttin.cviko6.Hrana;

/**
 * Created by ogajduse on 4/4/17.
 */
public class Executable {
    public static void main(String[] args) {
        Graf g = new Graf();
        g.pridejHranu("A", "B", 11);
        g.pridejHranu("A", "E", 9);
        g.pridejHranu("A", "C", 4);
        g.pridejHranu("B", "E", 2);
        g.pridejHranu("C", "E", 2);
        g.pridejHranu("E", "D", 8);
        g.pridejHranu("B", "D", 2);
        g.pridejHranu("C", "D", 7);

        Djikstra d = new Djikstra(g);
        //Cesta c = d.run("A", "B");
        //System.out.println(c);
        Cesta c = new Cesta(g);
        c.pridejUzel("A");
        c.pridejUzel("E");
        c.pridejUzel("B");

        for (Hrana h : c.getLastNode().getSousede()) {
            Cesta copy = c.cloneAndAdd(h.getSoused(c.getLastNode()).getHodnota());
            String value = copy.getLastNode().getHodnota();
            System.out.println("Copy A-E-B-" + value + "\tcost=" + copy.getCena());
        }


    }
}
