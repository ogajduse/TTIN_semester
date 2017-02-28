package cz.vutbr.feec.cviko3;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ogajduse on 2/21/17.
 */
public class Slozenina extends Tvar{

    private ArrayList<Tvar> obsah = new ArrayList<>();

    public Slozenina(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void pridej(Tvar novyTvar){
        this.obsah.add(novyTvar);
    }

    @Override
    public void vykresli(){
        System.out.println("Slozenia obsahuje: \n");
        for (Tvar tvar : obsah){
            tvar.vykresli();
        }
    }
}