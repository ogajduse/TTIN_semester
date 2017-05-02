package cz.vutbr.feec.utko.ttin.cviko12.hotel;

import java.util.Vector;

/**
 * Created by ogajduse on 4/25/17.
 */
public class Executable {
    public static void main(String[] args) {
        Vector<Pokoj> pokoje = new Vector();
        for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
            for (int j = 1; j < 11; j++) {
                pokoje.add(new Pokoj(Character.toString(alphabet), j));
            }

        }

        Rezervace r1 = new Rezervace("anezka kralova", 2, pokoje.get(1));
        Rezervace r2 = new Rezervace("Jarousek Frantik", 5, pokoje.get(3));

    }
}
