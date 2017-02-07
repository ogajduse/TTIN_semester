package cz.vutbr.feec.pakety;

public class Paket {
    public int data;
    public Paket nasledujici;
    public Paket precchozi;

    public Paket(int data) {
        this.data = data;
    }
}
