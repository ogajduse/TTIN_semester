package cz.vutbr.feec.utko.ttin.cviko6;

import java.util.LinkedList;

/**
 * Created by ogajduse on 3/13/17.
 */
public class Uzel {
    private LinkedList<Hrana> sousede = new LinkedList<>();
    private String hodnota;

    public Uzel(String hodnota) {
        this.hodnota = hodnota;
    }

    public String getHodnota() {
        return hodnota;
    }

    public void setHodnota(String hodnota) {
        this.hodnota = hodnota;
    }

    public LinkedList<Hrana> getSousede() {
        return sousede;
    }

    public void pridejSouseda(Uzel u, int cena) {
        for (Hrana hrana : sousede) {
            if (!(hrana.getLevy() == this) ? u == hrana.getLevy() : u == hrana.getPravy() ||
                    !(this == hrana.getPravy()) ? u == hrana.getPravy() : u == hrana.getLevy()) {
                System.out.println("Tento uzel jiz ma takoveho souseda");
                return;
            }
            sousede.add(new Hrana(this, u, cena));

        }
    }

    public void pridejHranu(Hrana novaHrana){
        sousede.add(novaHrana);
    }

}

