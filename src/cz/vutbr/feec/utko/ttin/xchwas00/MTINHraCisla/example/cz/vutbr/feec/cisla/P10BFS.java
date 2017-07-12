package cz.vutbr.feec.cisla;

import java.util.Random;

public class P10BFS {
	public static void main(String[] args) {
		HraciPole h = new HraciPole();		
		Random rnd = new Random();
		for (int i = 0; i < 1000000; i++) {
			int nahodne = rnd.nextInt(4);
			h.pohni(1 + nahodne);
		}
		long start = System.currentTimeMillis();
		BFS bfs = new BFS();
		System.out.println(h);
		bfs.vypisTahy(h);		
		System.out.println(System.currentTimeMillis() - start);
		
	}
}
