package cz.vutbr.feec.utko.ttin.cviko10.elearning.example;

/**
 * Tento priklad ukazuje, jak nacist a vypsat veskere hodnoty z nactene trenovaci sady
 */
public class Priklad7 {
    public static void main(String[] args) {
        ExampleSet es = ExampleSet.read("data/trainingset.txt");

        // Nastavim data na spravnou hodnotu:
        DecisionTreeLearner l = new DecisionTreeLearner();
        Model model = l.train(es);
        model.apply(es);

        AccuracyEvaluator ae = new AccuracyEvaluator();
        double accuracy = ae.evaluate(es);

        System.out.println("Presnost je " + accuracy + " %");

    }
}
