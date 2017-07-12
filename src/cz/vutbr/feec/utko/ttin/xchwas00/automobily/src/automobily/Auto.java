package automobily;

public abstract class Auto {
	private String vin;
	private String nazev;
	private String barva;
	
	public Auto(String vin, String nazev, String barva){
		this.vin = vin;
		this.nazev = nazev;
		this.barva = barva;
	}

	public String getVin() {
		return vin;
	}

	public String getNazev() {
		return nazev;
	}

	public String getBarva() {
		return barva;
	}

	public void setBarva(String barva) {
		this.barva = barva;
	}
	
	
}
