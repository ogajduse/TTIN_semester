package cz.vutbr.feec.utko.ttin.cviko7.elearningImport;

import java.util.HashSet;
import java.util.LinkedList;

import cz.vutbr.feec.utko.ttin.cviko3.exam2.HraciPole;

public class BFS {
	public void vypisTahy(HraciPole zadani) {
		LinkedList<HraciPole> open = new LinkedList<HraciPole>();
		
		// TIP: Vyzkousejte s ruznyma strukturama
		HashSet<HraciPole> closed = new HashSet<HraciPole>();
		// TreeSet<HraciPole> closed = new TreeSet<HraciPole>();
		// LinkedList<HraciPole> closed = new LinkedList<HraciPole>();
		open.addFirst(zadani);
		while (!open.isEmpty()) {
			HraciPole tmp = open.removeLast();
			if(tmp.jeReseni()) {
				System.out.println("Reseni nalezeno "+tmp);
				return;
			}
			for (int i = 1; i <= 4; i++) {
				HraciPole nove = tmp.klonujAPohni(i);
				if(nove != null && !closed.contains(nove)) {
					open.addFirst(nove);
					closed.add(nove);			
				}
			}
		}
		System.out.println("Reseni neexistuje");
	}
}
