package sklad;

public class Polozka extends Sklad {
	public String zbozi;
	public int ks;
	public double cena;
	
	public Polozka(String zbozi, int ks, double cena){
		this.zbozi = zbozi;
		this.ks = ks;
		this.cena = cena;
	}

	public String getZbozi() {
		return zbozi;
	}

	public void setZbozi(String zbozi) {
		this.zbozi = zbozi;
	}
	
	public int getKs() {
		return ks;
	}
	public void setKs(int ks) {
		this.ks = ks;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	
	public double secti(Polozka polozka){
		double soucet = 0;
		for (Polozka p : polozka.values()) {
			double soucet = p.getCena() * p.getKs();
		}
		return soucet;
	}
}
