package pr5;

import java.util.Vector;

public class Uzel {
	private Vector<Uzel> sousede = new Vector<>();
	public void pridejSouseda(Uzel uzel) {
		sousede.addElement(uzel);
		
	}

}
