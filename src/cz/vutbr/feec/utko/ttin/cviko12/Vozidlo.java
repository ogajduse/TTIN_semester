package cz.vutbr.feec.utko.ttin.cviko12;

/**
 * Created by ogajduse on 4/25/17.
 */
public abstract class Vozidlo {
    private String vin;

    public Vozidlo(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }
}
