package cz.vutbr.feec.utko.ttin.cviko7.elearningImport.example;

import cz.vutbr.feec.utko.ttin.cviko3.exam2.HraciPole;

import java.util.Random;

/**
 * Tento priklad demonstruje jak nahodne zamichat pocatecni reseni s pomoci
 * 10000 nahodnych tahu.
 */
public class P02Randomize {
    public static void main(String[] args) {
        HraciPole g = new HraciPole();
        Random rnd = new Random();
        for (int i = 0; i < 100000; i++) {
            // nahodne cislo 0 - 3
            int nahodne = rnd.nextInt(4);
            g.posun(1 + nahodne);
        }
        System.out.println(g);
    }
}
