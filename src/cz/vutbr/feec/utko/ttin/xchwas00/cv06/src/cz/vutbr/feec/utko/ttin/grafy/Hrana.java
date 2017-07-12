package cz.vutbr.feec.utko.ttin.grafy;

public class Hrana {
	public Hrana(Uzel prava, Uzel leva, int cena) {
		this.prava = prava;
		this.leva = leva;
		this.cena = cena;
	}
	private Uzel prava;
	private Uzel leva;
	private int cena;
	public Uzel getPrava() {
		return prava;
	}
	public void setPrava(Uzel prava) {
		this.prava = prava;
	}
	public Uzel getLeva() {
		return leva;
	}
	public void setLeva(Uzel leva) {
		this.leva = leva;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public
	
}
