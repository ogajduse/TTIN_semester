package cz.vutbr.feec.utko;

/**
 *	Ukazuje data 
 */
public class Priklad2 {
	public static void main(String[] args) {
		ExampleSet es = ExampleSet.read("data/trainingset.txt");

		System.out.println("Radek 0 obsahuje nasedujici data:");
		System.out.println(es.get(1));
	}
}