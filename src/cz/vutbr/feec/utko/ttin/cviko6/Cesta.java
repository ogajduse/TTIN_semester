package cz.vutbr.feec.utko.ttin.cviko6;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by ogajduse on 3/14/17.
 */
public class Cesta {
    private Graf g;
    private ArrayList<Uzel> uzly = new ArrayList<>();


    public Cesta(Graf g) {
        this.g = g;
    }

    public void pridejUzel(String s) {
        uzly.add(g.najdiUzel(s));
    }


    public Uzel getLastNode() {
        return lastNode;
    }

    public int getCena() {
        for (int i = 0; i < uzly.size() ; i++) {
            LinkedList<Hrana> sousede = uzly.get(i).getSousede();
            for (Hrana h : sousede){

            }
        }
        return 0;

    public Cesta cloneAndAdd(String value){
        Cesta copy = new Cesta(g);
        copy.lastNode = lastNode;
        copy.cost = cost;
        copy.uzly.addAll(uzly);


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
