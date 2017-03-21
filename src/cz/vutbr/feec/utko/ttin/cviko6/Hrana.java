package cz.vutbr.feec.utko.ttin.cviko6;

/**
 * Created by ogajduse on 3/14/17.
 */
public class Hrana {
    private Uzel levy;
    private Uzel pravy;
    private int cena;

    public Hrana(Uzel levy, Uzel pravy, int cena) {
        this.levy = levy;
        this.pravy = pravy;
        this.cena = cena;
    }

    public Uzel getLevy() {
        return levy;
    }

    public void setLevy(Uzel levy) {
        this.levy = levy;
    }

    public Uzel getPravy() {
        return pravy;
    }

    public void setPravy(Uzel pravy) {
        this.pravy = pravy;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }


}
