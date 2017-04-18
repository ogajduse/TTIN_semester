package cz.vutbr.feec.utko.ttin.cviko11.elearning.example;

import cz.vutbr.feec.utko.ttin.cviko11.elearning.ga.Chromozome;
import cz.vutbr.feec.utko.ttin.cviko11.elearning.ga.Fitness;

import java.io.IOException;

/**
 * Tento priklad zobrazuje miru podobnosti vuci predloze.
 */
public class Priklad2 {
    public static void main(String[] args) throws IOException {
        // Priklad 1
        Chromozome ch1 = new Chromozome();
        ch1.mutateAll();

        // Porovnavaci trida vuci obrazku orloj.jpg
        Fitness eval = new Fitness("data/cviko11/image/orloj.jpg");

        // poorvnej
        int error = eval.getFitness(ch1);

        System.out.println("Mira chyby vuci predloze: " + error);
    }
}
