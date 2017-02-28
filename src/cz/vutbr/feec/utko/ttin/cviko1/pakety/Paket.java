package cz.vutbr.feec.utko.ttin.cviko1.pakety;

public class Paket {
    public int data;
    public Paket nasledujici;
    public Paket precchozi;

    public Paket(int data) {
        this.data = data;
    }
}
