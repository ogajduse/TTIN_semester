package cz.vutbr.feec.utko;

public class GINIIndexEvaluator implements Evaluator {
	public double evaluate(ExampleSet es) {
		int matches1 = getNumOfMatches(es, 1.0);
		int matches2 = getNumOfMatches(es, 2.0);
		int matches3 = getNumOfMatches(es, 3.0);
		
		double prob1 = matches1/ (double) es.size();
		double prob2 = matches2/ (double) es.size();
		double prob3 = matches3/ (double) es.size();
	
		return 1.0 - (prob1*prob1 + prob2 * prob2 + prob3*prob3);
	}

	private int getNumOfMatches(ExampleSet es, double value) {
		int matches = 0;
		for (int i = 0; i < es.size(); i++) {
			Example radek = es.get(i);
			if (radek.getPrediction() == value) {
				matches++;
			}
		}
		return matches;
	}
}
