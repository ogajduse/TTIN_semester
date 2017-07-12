package cv03_zadani1;

import java.util.Vector;

public class Slozenina extends GrafickyObjekt {
	
	private Vector<GrafickyObjekt> objekty = new Vector<>();
	
	public Slozenina(int bodX, int bodY){
			this.bodX = bodX;
			this.bodY = bodY;			
	}

	@Override
	public void vykresli() {
		System.out.println("Vykresluji... ");
		for (GrafickyObjekt grafickyObjekt : objekty) {
			grafickyObjekt.vykresli();
		}
	}
	
	public void pridej(GrafickyObjekt o){
		objekty.add(o);
	}

}
