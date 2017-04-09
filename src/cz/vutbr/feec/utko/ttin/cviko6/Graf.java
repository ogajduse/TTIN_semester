package cz.vutbr.feec.utko.ttin.cviko6;

import java.util.HashMap;

/**
 * Created by ogajduse on 3/13/17.
 */
public class Graf {
    private HashMap<String, Uzel> uzly = new HashMap<>();

    public void pridejHranu(String src, String dst, int cena) { // 8 9 3
        Uzel srcUzel = uzly.get(src);
        Uzel dstUzel = uzly.get(dst);

        if (!(srcUzel == null) && !(dstUzel == null) && srcUzel.getSousede().contains(dstUzel)) {
            System.out.println("takova cesta jiz existuje");
            return;
        }
        if (srcUzel == null) {
            srcUzel = new Uzel(src);
            uzly.put(src, srcUzel);
        }
        if (dstUzel == null) {
            dstUzel = new Uzel(dst);
            uzly.put(dst, dstUzel);
        }

        Hrana h = new Hrana(srcUzel, dstUzel, cena);
        srcUzel.pridejHranu(h);
        dstUzel.pridejHranu(h);
    }

    public Uzel najdiUzel(String identifikator) {
        return uzly.get(identifikator);
    }
}
