package cz.vutbr.feec.utko.ttin.cviko1.auto;


public class Spustitelna {
    public static void main(String[] args) {
        Auto a1 = new Auto();
        a1.cena = 200;
        Auto a2 = new Auto();
        a1.cena = 300;
        Auto a3 = new Auto();
        a1.cena = 400;
        Auto a4 = new Auto();
        a1.cena = 500;

        Mapa map = new Mapa();
        map.auto1 = a1;
        map.auto2 = a2;
    }

}
