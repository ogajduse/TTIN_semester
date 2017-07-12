package cz.vutbr.feec.utko;

public class AccuracyEvaluator {
	public double evaluate(ExampleSet es) {
		int matches = 0;
		for (int i = 0; i < es.size(); i++) {
			Example e = es.get(i);
			if(e.getLabel() == e.getPrediction()) {
				matches++;
			}
		}
		// kolik odpovida deleno poctem vzorku
		return matches / (double)es.size();
	}
}
