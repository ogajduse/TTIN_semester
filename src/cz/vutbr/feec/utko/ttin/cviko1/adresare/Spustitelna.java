package cz.vutbr.feec.utko.ttin.cviko1.adresare;

public class Spustitelna {

    public static void main(String[] args) {
        Adresar a1 = new Adresar("a1");
        Adresar a4 = new Adresar("a4");
        a1.levy = a1;
        Adresar a2 = new Adresar("a2");
        a1.pravy = a2;
        Adresar a3 = new Adresar("a3");
        a2.pravy = a3;
        Adresar a5 = new Adresar("a5");
        a2.levy = a5;
    }
}
