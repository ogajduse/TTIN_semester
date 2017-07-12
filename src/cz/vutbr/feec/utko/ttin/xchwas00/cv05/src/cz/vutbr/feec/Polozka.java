package cz.vutbr.feec;

public class Polozka {
	private int data;
	private Polozka leva;
	private Polozka prava;
	private Polozka rodic;
	
	public Polozka getRodic() {
		return rodic;
	}
	public void setRodic(Polozka rodic) {
		this.rodic = rodic;
	}
	public int getData() {
		return data;
	}
	public Polozka(int data) {
		this.data = data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Polozka getLeva() {
		return leva;
	}
	public void setLeva(Polozka leva) {
		this.leva = leva;
	}
	public Polozka getPrava() {
		return prava;
	}
	public void setPrava(Polozka prava) {
		this.prava = prava;
	}
	

}
