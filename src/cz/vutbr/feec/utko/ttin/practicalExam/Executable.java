package cz.vutbr.feec.utko.ttin.practicalExam;

/**
 * Created by ogajduse on 5/2/17.
 */
public class Executable {
    private static final int BILA = Barva.BILA;
    private static final int SEDA = Barva.SEDA;

    public static void main(String[] args) {
        LinearList seznam = new LinearList();

        seznam.pridejNaZacatek(9, SEDA);
        seznam.pridejNaZacatek(8, BILA);
        seznam.pridejNaZacatek(7, SEDA);
        seznam.pridejNaZacatek(5, SEDA);
        seznam.pridejNaZacatek(2, BILA);
        seznam.pridejNaZacatek(1, BILA);

        System.out.println("List now contains " + seznam.getCount() + "nodes.");
        seznam.odstranBarvu(SEDA);
        System.out.println("List now contains " + seznam.getCount() + "nodes.");
    }
}
