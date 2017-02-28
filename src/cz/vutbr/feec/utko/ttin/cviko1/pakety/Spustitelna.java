package cz.vutbr.feec.utko.ttin.cviko1.pakety;

public class Spustitelna {
    public static void main(String[] args) {
        Paket p1 = new Paket(1);
        Paket p2 =new Paket(2);
        Paket p3 = new Paket(3);
        Paket p4 = new Paket(4);

        p1.nasledujici = p2;
        p2.nasledujici = p3;
        p3.nasledujici = p4;
        p4.nasledujici = p1;

    }
}

