package cz.vutbr.feec.utko.ttin.cviko10.elearning.example;

import cz.vutbr.feec.utko.ttin.cviko10.elearning.src.ExampleSet;

public class Priklad1 {
    public static void main(String[] args) {
        // Nacita trenovaci data a uklada je do pameti

        ExampleSet es = ExampleSet.read("data/cviko10/trainingset.txt");
        System.out.println("Pocet radku: " + es.size());
    }
}
