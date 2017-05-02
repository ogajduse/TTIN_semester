package cz.vutbr.feec.utko.ttin.cviko12.cesta_ve_stromu;

/**
 * Created by ogajduse on 4/25/17.
 */
public class Uzel {
    private Uzel rodic;
    private Uzel pravy;
    private Uzel levy;
    private int hodnota;

    public Uzel(Uzel rodic, Uzel pravy, Uzel levy, int hodnota) {
        this.rodic = rodic;
        this.pravy = pravy;
        this.levy = levy;
        this.hodnota = hodnota;
    }

    public Uzel getRodic() {
        return rodic;
    }

    public void setRodic(Uzel rodic) {
        this.rodic = rodic;
    }

    public Uzel getPravy() {
        return pravy;
    }

    public void setPravy(Uzel pravy) {
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
}
