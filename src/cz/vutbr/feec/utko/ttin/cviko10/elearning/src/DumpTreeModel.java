package cz.vutbr.feec.utko.ttin.cviko10.elearning.src;

public class DumpTreeModel implements Model {

    @Override
    public void apply(ExampleSet set) {
        // TODO Priklad 6
        for (int i = 0; i < set.size(); i++) {
            if (set.get(i).getAttribute(3) < 1.0) {
                set.get(i).setPrediction(1.0);
            } else if (set.get(i).getAttribute(2) < 5.0) {
                set.get(i).setPrediction(2.0);
            } else {
                set.get(i).setPrediction(3.0);
            }
        }
    }

}
