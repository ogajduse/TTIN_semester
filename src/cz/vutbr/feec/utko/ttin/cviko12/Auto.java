package cz.vutbr.feec.utko.ttin.cviko12;

/**
 * Created by ogajduse on 4/25/17.
 */
public abstract class Auto extends Vozidlo {
    private String nazev;
    private String barva;

    public Auto(String vin, String nazev, String barva) {
        super(vin);
        this.nazev = nazev;
        this.barva = barva;
    }

    public String getNazev() {
        return nazev;
    }

    public String getBarva() {
        return barva;
    }

    public void setBarva(String barva) {
        this.barva = barva;
    }
}
