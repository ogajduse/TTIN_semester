package hotel;

public class Hotel {
	public String pokoj;
	public String jmeno;
	public int pocetNoci;
	
	public Hotel(String pokoj, String jmeno, int pocetNoci){
		this.pokoj = pokoj;
		this.jmeno = jmeno;
		this.pocetNoci = pocetNoci;
	}	
	public String getPokoj() {
		return pokoj;
	}
	public void setPokoj(String pokoj) {
		this.pokoj = pokoj;
	}
	public String getJmeno() {
		return jmeno;
	}
	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}
	public int getPocetNoci() {
		return pocetNoci;
	}
	public void setPocetNoci(int pocetNoci) {
		this.pocetNoci = pocetNoci;
	}	
}
