package cz.vutbr.feec.utko;

public class MujModel implements Model {
	private double threshold;
	private int index;
	
	public MujModel(int index, double threshold){
		this.index = index;
		this.threshold = threshold;		
	}
	
	public void apply(ExampleSet es){
		for (int i = 0; i < es.size(); i++) {
			Example radek = es.get(i);
			if (radek.getAtribute(index) < threshold) {
				radek.setPrediction(1.0);
			} else {
				radek.setPrediction(3.0);
			}
		}
		
	}
	
	//public String toString(){
	
	//}
}
