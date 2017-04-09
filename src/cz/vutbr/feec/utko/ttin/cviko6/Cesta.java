package cz.vutbr.feec.utko.ttin.cviko6;

import java.util.Vector;

/**
 * Created by ogajduse on 3/14/17.
 */
public class Cesta implements Comparable<Cesta> {
    private Graf g;
    private Uzel lastNode = null;
    private Vector<Uzel> uzly = new Vector<>();
    private int cost;

    public Cesta(Graf g) {
        this.g = g;
    }

    public void pridejUzel(String s) {
        Uzel uzel = g.najdiUzel(s);
        if (lastNode == null) {
            cost = 0;
        } else {
            cost += lastNode.getCost(uzel);
        }
        lastNode = uzel;
        uzly.add(uzel);
    }


    public Uzel getLastNode() {
        return lastNode;
    }

    public int getCena() {
        return cost;
    }

    public boolean isAtDestination(String destination) {
        if (lastNode == null) {
            return false;
        } else {
            return destination.equals(lastNode.getHodnota());
        }
    }

    public Cesta cloneAndAdd(String value) {
        Cesta copy = new Cesta(g);
        copy.lastNode = lastNode;
        copy.cost = cost;
        copy.uzly.addAll(uzly);

        copy.pridejUzel(value);
        return copy;

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Cesta cesta) {
        Integer c1 = cost;
        Integer c2 = cesta.getCena();
        return c1.compareTo(c2);
    }
}
