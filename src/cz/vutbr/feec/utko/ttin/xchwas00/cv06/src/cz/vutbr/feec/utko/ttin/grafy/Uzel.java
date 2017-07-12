package cz.vutbr.feec.utko.ttin.grafy;

import java.util.LinkedList;

public class Uzel {
	private String cislo;
	private LinkedList<Hrana> sousedi = new LinkedList<>();	

	public Uzel(String cislo) {
		this.cislo = cislo;
	}

	public LinkedList<Hrana> getSousedi() {
		return sousedi;
	}

	public void setSousedi(LinkedList<Hrana> sousedi) {
		this.sousedi = sousedi;
	}

	public String getCislo() {
		return cislo;
	}
	public void setCislo(String cislo) {
		this.cislo = cislo;
	}

	public void pridejHranu(Hrana novaHrana){
		sousedi.add(novaHrana);
	}
	
	public int getCost(Uzel u){
		for (Hrana h : sousedi) {
			if (h.getLeva() == u || h.getPrava() == u) {
				return h.getCena();
			}
		}
		return 99999;		
	}
	
}
