package cz.vutbr.feec.utko.ttin.cviko4.exam1;

/**
 * Created by ogajduse on 2/28/17.
 */
public class Executable {
    public static void main(String[] args) {
        LinearList seznam = new LinearList();
        seznam.pridejNaZacatek(2);
        seznam.pridejNaZacatek(5);
        seznam.pridejNaZacatek(8);
        seznam.pridejNaZacatek(1);

        System.out.println(seznam.obsahuje(5)); //true
        System.out.println(seznam.obsahuje(9)); //false

        seznam.odstranZeZacatku();
        seznam.odstranZeZacatku();

        System.out.println(seznam.obsahuje((5)));
        System.out.println(seznam.obsahuje((2)));
        System.out.println("List now contains " + seznam.getCount() + " nodes");
    }
}
