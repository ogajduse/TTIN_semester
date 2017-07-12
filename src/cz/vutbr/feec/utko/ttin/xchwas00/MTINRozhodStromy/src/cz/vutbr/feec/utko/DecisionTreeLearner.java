package cz.vutbr.feec.utko;

public class DecisionTreeLearner {

	public Model train(ExampleSet es) {
		double bestAcc = Double.MIN_VALUE;
		Model bestModel = null;
		for (int index = 0; index < 4; index++) {
			for (double t = 0.0; t < 10.0; t+=0.1) {
				Model m = new MujModel(index, t);
				m.apply(es);
				GINIIndexEvaluator ae = new GINIIndexEvaluator();
				double accuracy = ae.evaluate(es);
				if (accuracy > bestAcc) {
					bestAcc = accuracy;
					bestModel = m;
				}
			}
		}
		
		return bestModel;
	}
	
	
}
