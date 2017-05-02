package cz.vutbr.feec.utko.ttin.cviko12.sklad;

import java.util.HashMap;

/**
 * Created by ogajduse on 4/25/17.
 */
public class Sklad {
    private HashMap<Zbozi, Integer> zasoby;

    public Sklad() {
        this.zasoby = new HashMap<>();
    }

    public void addZbozi(Zbozi zbozi, int kusy) {
        this.zasoby.put(zbozi, kusy);
    }

    public int cenaSkladu() {
        int cena = 0;
        for (Zbozi zbozi : zasoby.keySet()){
            int pocetkusu = zasoby.get(zbozi);
            int cenakusu = zbozi.getCena();
            cena += pocetkusu * cenakusu;
        }
        return cena;
    }
}
