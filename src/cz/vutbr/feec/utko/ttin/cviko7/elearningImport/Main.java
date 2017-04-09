package cz.vutbr.feec.utko.ttin.cviko7.elearningImport;

import cz.vutbr.feec.utko.ttin.cviko3.exam2.HraciPole;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HraciPole h = new HraciPole();
        for (int i = 0; i < 10000; i++) {
            h.posun(new Random().nextInt(4) + 1);
        }
        System.out.println(h);
        BFS bfs = new BFS();
        bfs.vypisTahy(h);

    }
}
