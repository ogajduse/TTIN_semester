package cz.vutbr.feec.utko.ttin.cviko7.elearningImport.example;

import cz.vutbr.feec.utko.ttin.cviko3.exam2.HraciPole;
import cz.vutbr.feec.utko.ttin.cviko7.elearningImport.BFS;

import java.util.Random;

public class P10BFS {
	public static void main(String[] args) {
		HraciPole h = new HraciPole();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            int nahodne = rnd.nextInt(4);
            System.out.println(nahodne);
            h.posun(1+nahodne);
        }

        long start  = System.currentTimeMillis();

		BFS bfs = new BFS();
        System.out.println(h);
        bfs.vypisTahy(h);
        System.out.println(System.currentTimeMillis() - start);

    }
}
