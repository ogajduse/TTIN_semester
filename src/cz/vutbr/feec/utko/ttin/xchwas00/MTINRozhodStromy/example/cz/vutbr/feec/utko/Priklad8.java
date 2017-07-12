package cz.vutbr.feec.utko;

public class Priklad8 {
	public static void main(String[] args) {
		ExampleSet es = ExampleSet.read("data/trainingset.txt");

		DecisionTreeLearner l = new DecisionTreeLearner();
		Model model = l.train(es);
		model.apply(es);

		AccuracyEvaluator ae = new AccuracyEvaluator();
		double accuracy = ae.evaluate(es)*100;
		
		System.out.println("Presnost je " + accuracy + " %");
		
	}
}
