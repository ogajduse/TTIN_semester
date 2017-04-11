package cz.vutbr.feec.utko.ttin.cviko10.elearning.example;

import cz.vutbr.feec.utko.ttin.cviko10.elearning.src.AccuracyEvaluator;
import cz.vutbr.feec.utko.ttin.cviko10.elearning.src.DecisionTreeLearner;
import cz.vutbr.feec.utko.ttin.cviko10.elearning.src.ExampleSet;
import cz.vutbr.feec.utko.ttin.cviko10.elearning.src.Model;

/**
 * Tento priklad ukazuje, jak nacist a vypsat veskere hodnoty z nactene trenovaci sady
 */
public class Priklad7 {
    public static void main(String[] args) {
        ExampleSet es = ExampleSet.read("data/cviko10/trainingset.txt");

        // Nastavim data na spravnou hodnotu:
        DecisionTreeLearner l = new DecisionTreeLearner();
        Model model = l.train(es);
        model.apply(es);

        AccuracyEvaluator ae = new AccuracyEvaluator();
        double accuracy = ae.evaluate(es);

        System.out.println("Presnost je " + accuracy + " %");

    }
}
