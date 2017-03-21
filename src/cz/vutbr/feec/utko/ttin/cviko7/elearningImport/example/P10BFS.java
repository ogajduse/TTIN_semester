package cz.vutbr.feec.utko.ttin.cviko7.elearningImport.example;

import cz.vutbr.feec.utko.ttin.cviko3.exam2.HraciPole;
import cz.vutbr.feec.utko.ttin.cviko7.elearningImport.BFS;

public class P10BFS {
	public static void main(String[] args) {
		HraciPole h = null;
		// TODO: vytvorit nahodne hraci pole (viz priklad P2Randomize)
		BFS bfs = new BFS();
		bfs.vypisTahy(h);
		
	}
}
