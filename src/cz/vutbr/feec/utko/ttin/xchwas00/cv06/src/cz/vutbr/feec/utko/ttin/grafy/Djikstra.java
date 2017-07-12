package cz.vutbr.feec.utko.ttin.grafy;

import java.util.PriorityQueue;

public class Djikstra {

	private Graf g;

	public Djikstra(Graf g) {
		// TODO Auto-generated constructor stub
		this.g = g;
	}
	
	public Cesta getPath(String src, String dst){
		PriorityQueue<Cesta> prioFronta = new PriorityQueue<Cesta>();
		
		Cesta c = new Cesta(g);
		c.pridejUzel(src);
		prioFronta.add(c);
		
		while (!prioFronta.isEmpty()) {
			Cesta tmp = prioFronta.remove();
			if (tmp.isAtDestination(dst)) {
				return tmp;
			}
			for (Uzel u : tmp.getPosledniUzel().getCislo()) {
				Cesta kopie = tmp.cloneAndAddNode(nazevuzlu.getCislo());
				String nazevuzlu = kopie.getPosledniUzel().getCislo();
				System.out.println("Kopie: A-E-B " + nazevuzlu + " cena=" + kopie.getCena());
				prioFronta.add(kopie);
			}
		}
		return null;
		
	}
}
