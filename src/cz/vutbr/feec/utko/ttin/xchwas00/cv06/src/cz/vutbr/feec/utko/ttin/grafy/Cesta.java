package cz.vutbr.feec.utko.ttin.grafy;

import java.util.ArrayList;

public class Cesta implements Comparable<Cesta>{
	private Graf g;
	private ArrayList<Uzel> uzly = new ArrayList<>();
	private Uzel posledniUzel = null;
	private int cena;
	
	public Uzel getPosledniUzel() {
		return posledniUzel;
	}

	public void setPosledniUzel(Uzel posledniUzel) {
		this.posledniUzel = posledniUzel;
	}

	public Cesta(Graf g) {
		this.g=g;
	}

	public void pridejUzel(String string) {
		Uzel u = g.vratUzel(string);
		//uzly.add(g.vratUzel(string));
		if (posledniUzel == null) {
			cena = 0;
		} else {
			cena += posledniUzel.getCost(u);
		}
		posledniUzel = u;
		uzly.add(u);
	}

	public int getCena() {
		/*for (int i=0; i < uzly.size(); i++) {
			uzly.get(i);
		}*/
		return cena;
	}
	
	public boolean isAtDestination(String destination){
		if (posledniUzel == null) {
			return false;
		} else {
			return destination.equals(posledniUzel.getCislo());
		}		
	}
	
	public Cesta cloneAndAddNode(String nazevuzlu){
		Cesta kopie = new Cesta(g);
		kopie.posledniUzel = posledniUzel;
		kopie.cena = cena;
		kopie.uzly.addAll(uzly);
		kopie.pridejUzel(nazevuzlu);
		return kopie;				
	}

	@Override
	public int compareTo(Cesta o) {
		Integer c1 = cena;
		Integer c2 = cena;
		return c1.compareTo(c2);
	}
	


}
