package stromRekurze;

public class Uzel {
	private Uzel levy;
	private Uzel pravy;
	private int hodnota;

	public Uzel(int hodnota){
		this.hodnota = hodnota;
	}
	public Uzel getLevy() {
		return levy;
	}
	public void setLevy(Uzel levy) {
		this.levy = levy;
	}
	public Uzel getPravy() {
		return pravy;
	}
	public void setPravy(Uzel pravy) {
		this.pravy = pravy;
	}
	public int getHodnota() {
		return hodnota;
	}
	public void setHodnota(int hodnota) {
		this.hodnota = hodnota;
	}
	
	public int secti(){
		int soucet = hodnota;
		if (levy != null) {
			soucet = soucet + levy.secti();
		}
		if (pravy != null) {
			soucet = soucet + pravy.secti();
		}		
		return soucet;
	}
}
