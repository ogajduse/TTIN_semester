package cz.vutbr.feec.utko;

public class DumpTreeModel2 implements Model {

	@Override
	public void apply(ExampleSet set) {
		
			Uzel vstup = new Uzel(3, 1.0);
			vstup.setLeft(new Uzel(1.0));
			Uzel podm2 = new Uzel(2, 5.0);
			podm2.setLeft(new Uzel(2.0));
			podm2.setRight(new Uzel(3.0));
			vstup.setRight(podm2);
		
		
		for (int i = 0; i < set.size(); i++) {
			vstup.nastavPredikci(set.get(i));
		}
			
		
		
	}

}
