package cz.vutbr.feec.utko;

public class DumpTreeModel implements Model {

	@Override
	public void apply(ExampleSet set) {
		for (int i = 0; i < set.size(); i++) {
			if (set.get(i).getAtribute(3) < 1.0) {
				set.get(i).setPrediction(1.0);
			} else {
				if (set.get(i).getAtribute(2) < 5.0) {
					set.get(i).setPrediction(2.0);
				} else {
					set.get(i).setPrediction(3.0);
				}
			}
		}
	}

}
