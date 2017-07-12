package cv03_zadani1;

public class Kruh extends GrafickyObjekt {

	private int r;
	
	public Kruh(int bodX, int bodY, int r) {
		this.bodX = bodX;
		this.bodY = bodY;
		this.r = r;
	}

	@Override
	public void vykresli() {
		System.out.println("Vykreslujeme kruh na souradnici " + bodX + bodY);		
	}
}
