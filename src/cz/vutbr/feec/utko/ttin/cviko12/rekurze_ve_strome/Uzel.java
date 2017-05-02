package cz.vutbr.feec.utko.ttin.cviko12.rekurze_ve_strome;

/**
 * Created by ogajduse on 4/25/17.
 */
public class Uzel {
    private int hodnota;
    private Uzel levy;
    private Uzel pravy;

    public Uzel(int hodnota, Uzel levy, Uzel pravy) {
        this.hodnota = hodnota;
        this.levy = levy;
        this.pravy = pravy;
    }

    public int getHodnota() {
        return hodnota;
    }

    public void setHodnota(int hodnota) {
        this.hodnota = hodnota;
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

    public int secti() {
        int soucet = 0;
        soucet += this.hodnota;
        if (this.getLevy() != null) {
            soucet += getLevy().secti();
        }
        if (this.getPravy() != null) {
            soucet += getPravy().secti();
        }
        return soucet;
    }

}

