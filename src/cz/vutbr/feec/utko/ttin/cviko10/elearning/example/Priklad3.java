package cz.vutbr.feec.utko.ttin.cviko10.elearning.example;

import cz.vutbr.feec.utko.ttin.cviko10.elearning.src.ExampleSet;

/**
 * Tento priklad ukazuje, jak nacist a vypsat veskere hodnoty z nactene trenovaci sady
 */
public class Priklad3 {
    public static void main(String[] args) {
        ExampleSet es = ExampleSet.read("data/trainingset.txt");

        for (int i = 0; i < es.size(); i++) {
            // vezme radek kodu
            System.out.print(es.get(i));
            // vypise tzv. label = skutecnou tridu kam spada
            System.out.print(", label=" + es.get(i).getLabel());
            // vypise predpovezenou tridu
            System.out.println(", prediction=" + es.get(i).getPrediction());
        }
    }
}
