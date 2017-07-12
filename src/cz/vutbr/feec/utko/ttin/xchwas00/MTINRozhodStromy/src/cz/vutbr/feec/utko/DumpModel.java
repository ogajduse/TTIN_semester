package cz.vutbr.feec.utko;

public class DumpModel implements Model {

	public void apply(ExampleSet es) {
		for (int i = 0; i < es.size(); i++) {
			es.get(i).setPrediction(1.0);
		}
	}
	
}
