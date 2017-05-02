package cz.vutbr.feec.utko.ttin.cviko12.hotel;

/**
 * Created by ogajduse on 4/25/17.
 */
public class Rezervace {
    private String jmeno;
    private int pocetNoci;
    private Pokoj pokoj;

    public Rezervace(String jmeno, int pocetNoci, Pokoj pokoj) {
        this.jmeno = jmeno;
        this.pocetNoci = pocetNoci;
        this.pokoj = pokoj;
    }

    public Pokoj getPokoj() {
        return pokoj;
    }

    public void setPokoj(Pokoj pokoj) {
        this.pokoj = pokoj;
    }
}
