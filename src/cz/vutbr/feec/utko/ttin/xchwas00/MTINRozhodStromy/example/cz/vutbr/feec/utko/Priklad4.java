package cz.vutbr.feec.utko;

/**
 *	Tento priklad ukazuje, jak nacist a vypsat veskere hodnoty z nactene trenovaci sady
 */
public class Priklad4 {
	public static void main(String[] args) {
		ExampleSet es = ExampleSet.read("data/trainingset.txt");

		// Nastavim data na spravnou hodnotu:
		for (int i = 0; i < es.size(); i++) {
			es.get(i).setPrediction(1.0);
		}
		

		AccuracyEvaluator ae = new AccuracyEvaluator();
		double accuracy = ae.evaluate(es)*100;
		
		
		System.out.println("Presnost je " + accuracy + " %");
		
	}
}
