package cz.vutbr.feec.utko.ttin.cviko7.elearningImport.example;

import cz.vutbr.feec.utko.ttin.cviko3.exam2.HraciPole;

/**
 * Priklad jak vytvorit jednu pametovou polozku a provest pohyb.
 */
public class P01Move {
    public static void main(String[] args) {
        HraciPole p = new HraciPole();
        System.out.println(p);

        int NAHORU = 1;
        p.posun(NAHORU);
        System.out.println(p);
    }
}
