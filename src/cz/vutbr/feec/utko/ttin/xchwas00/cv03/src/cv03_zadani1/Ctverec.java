package cv03_zadani1;

public class Ctverec extends GrafickyObjekt {

	private int a;
	public Ctverec(int bodX, int bodY, int a) {
		this.bodX = bodX;
		this.bodY = bodY;
		this.a = a;
	}

	@Override
	public void vykresli() {
		System.out.println("Vykreslujeme ctverec na souradnici " + bodX + bodY);		
	}

}
