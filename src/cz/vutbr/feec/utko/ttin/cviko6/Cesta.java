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


    public int getCena() {
        for (int i = 0; i < uzly.size() ; i++) {
            LinkedList<Hrana> sousede = uzly.get(i).getSousede();
            for (Hrana h : sousede){

            }
        }
        return 0;
    }
}
