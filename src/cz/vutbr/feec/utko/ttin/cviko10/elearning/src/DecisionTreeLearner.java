package cz.vutbr.feec.utko.ttin.cviko10.elearning.src;

public class DecisionTreeLearner {

    public Model train(ExampleSet es) {
        return new DumpModel();
    }

}
