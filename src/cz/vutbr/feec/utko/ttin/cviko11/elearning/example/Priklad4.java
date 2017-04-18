package cz.vutbr.feec.utko.ttin.cviko11.elearning.example;

import cz.vutbr.feec.utko.ttin.cviko11.elearning.ga.Chromozome;

import java.io.IOException;

/**
 * Tento priklad ukazuje jak krizit dva chromozomy.
 */
public class Priklad4 {
    public static void main(String[] args) throws IOException {
        // Priklad 1
        Chromozome ch1 = new Chromozome();
        ch1.mutateAll();

        Chromozome ch2 = new Chromozome();
        ch2.mutateAll();


        ch1.crossOver(ch2);
    }
}
