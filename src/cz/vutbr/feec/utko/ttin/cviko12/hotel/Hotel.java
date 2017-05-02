package cz.vutbr.feec.utko.ttin.cviko12.hotel;

import java.util.HashMap;
import java.util.Vector;

/**
 * Created by ogajduse on 4/25/17.
 */
public class Hotel {
    private HashMap<Character, Vector<Pokoj>> pokoje = new HashMap<>();

    public Hotel(char startChar, char endchar, int numberOfRooms) {
        numberOfRooms++;
        for (char alphabet = startChar; alphabet <= startChar; alphabet++) {
            Vector<Pokoj> tmpPatro = new Vector<>();
            for (int j = 1; j < numberOfRooms; j++) {
                tmpPatro.add(new Pokoj(Character.toString(alphabet), j));
            }
            pokoje.put(alphabet, tmpPatro);
        }
    }

    public boolean rezervuj(){
        return false;
    }
}
