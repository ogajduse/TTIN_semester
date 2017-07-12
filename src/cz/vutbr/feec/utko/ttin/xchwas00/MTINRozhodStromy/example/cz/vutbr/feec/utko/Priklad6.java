package cz.vutbr.feec.utko;

/**
 *	Tento priklad ukazuje, jak nacist a vypsat veskere hodnoty z nactene trenovaci sady
 */
public class Priklad6 {
	public static void main(String[] args) {
		ExampleSet es = ExampleSet.read("data/trainingset.txt");

		// Nastavim data na spravnou hodnotu:
		
		DumpTreeModel2 model = new DumpTreeModel2();
		model.apply(es);

		AccuracyEvaluator ae = new AccuracyEvaluator();
		double accuracy = ae.evaluate(es)*100;
		
		
		System.out.println("Presnost je " + accuracy + " %");
		
	}
}
