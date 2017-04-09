package cz.vutbr.feec.utko.ttin.cviko3.exam2;

import java.util.HashSet;

/**
 * Created by ogajduse on 2/21/17.
 */
public class Main {
    public static void main(String[] args) {
        HashSet<HraciPole> mnozina = new HashSet<>();
        final int NAHORU = HraciPole.NAHORU;
        final int DOLU = HraciPole.DOLU;
        final int DOPRAVA = HraciPole.DOPRAVA;
        final int DOLEVA = HraciPole.DOLEVA;

        HraciPole hra1 = new HraciPole();
        mnozina.add(hra1);

        HraciPole hra2 = new HraciPole();
        hra2.posun(DOLU);
        hra2.posun(NAHORU);
        mnozina.add(hra2);
        System.out.println(hra2.compareTo(hra1));

        HraciPole hra3 = new HraciPole();
        mnozina.add(hra2);

        System.out.println(mnozina.size());

        /*{
            Vector<Integer> sadaPrikazu = new Vector<>();
            sadaPrikazu.add(DOLU);
            sadaPrikazu.add(DOPRAVA);
            sadaPrikazu.add(DOPRAVA);
            sadaPrikazu.add(DOLU);
            for (int prikaz : sadaPrikazu) {
                hra2.posun(prikaz);
                System.out.println(hra2.toString());
            }
        }*/
    }
}
