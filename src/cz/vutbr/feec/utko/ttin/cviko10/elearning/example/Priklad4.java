package cz.vutbr.feec.utko.ttin.cviko10.elearning.example;

import cz.vutbr.feec.utko.ttin.cviko10.elearning.src.AccuracyEvaluator;
import cz.vutbr.feec.utko.ttin.cviko10.elearning.src.ExampleSet;

/**
 * Tento priklad ukazuje, jak nacist a vypsat veskere hodnoty z nactene trenovaci sady
 */
public class Priklad4 {
    public static void main(String[] args) {
        ExampleSet es = ExampleSet.read("data/cviko10/trainingset.txt");

        // Nastavim data na spravnou hodnotu:
        es.get(0).setPrediction(1.0);

        AccuracyEvaluator ae = new AccuracyEvaluator();
        double accuracy = ae.evaluate(es);


        System.out.println("Presnost je " + accuracy + " %");

    }
}
