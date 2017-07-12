package cz.vutbr.feec.utko;

public class Uzel {
	private Uzel left;
	private Uzel right;
	
	private Double vystup;
	private int index;
	private double prah;
	
	public Uzel(int index, double prah){
		this.index = index;
		this.prah = prah;
		
	}
	
	public Uzel(double vystup){
		this.vystup = vystup;
	}

	public void setLeft(Uzel left) {
		this.left = left;
	}

	public void setRight(Uzel right) {
		this.right = right;
	}

	public void nastavPredikci(Example set) {
		if (vystup != null) {
			set.setPrediction(vystup);
		} else {
			if (set.getAtribute(index) < prah) {
				left.nastavPredikci(set);
			} else {
				right.nastavPredikci(set);
			}
		}		
	}
	

}
