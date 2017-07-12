package cz.vutbr.feec;

public class Strom {
	private Polozka root;
	private Polozka aktualni;
	public void pridej(int data){
		Polozka p = new Polozka(data);
		if (root==null) {
			root=new Polozka(data);
		}
		else {
			this.aktualni = root;
			boolean jeVeStromu = false;
			while (!jeVeStromu) {
				if (aktualni.getData()==data) {
					jeVeStromu = true;
				} else {
					p.setRodic(this.aktualni);
					if (aktualni.getData()<data) {
						if (this.aktualni.getPrava()==null) {
							this.aktualni.setPrava(p);
							this.aktualni = this.aktualni.getPrava();
							jeVeStromu=true;
						} else {
							this.aktualni = this.aktualni.getPrava();
						}
					}
					else {
						if (this.aktualni.getLeva()==null) {
							this.aktualni.setLeva(p);
							this.aktualni = this.aktualni.getLeva();
							jeVeStromu=true;
						} else {
							this.aktualni = this.aktualni.getLeva();
						}
					}
				}
				
			}
			
		}
		
	}	
	public boolean jePrazdny(){
		if (root==null) {
			return true;
		}
		return false;
	}
	
	public boolean obsahuje(int data){
		if (this.root!=null) {
			this.aktualni = this.root;
			while (this.aktualni!=null) {
				if (this.aktualni.getData() == data) {
					return true;
				}
				if (this.aktualni.getData() < data) {
					this.aktualni = this.aktualni.getPrava();
				} else {
					this.aktualni = this.aktualni.getLeva();
				}
			}			
			return false;
		} else {
			return false;
		}			
	}
}
