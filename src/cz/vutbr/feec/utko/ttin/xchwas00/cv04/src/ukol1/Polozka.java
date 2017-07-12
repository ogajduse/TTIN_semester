package ukol1;

public class Polozka {
	private int data;
	private Polozka dalsi;
	
	public Polozka(int data){
		this.data=data;	
	}
	
	public Polozka getDalsi() {
		return dalsi;
	}

	public void setDalsi(Polozka dalsi) {
		this.dalsi = dalsi;
	}

	public int getData() {
		return data;
	}
}
