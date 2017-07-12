package cv03_zadani1;

public abstract class GrafickyObjekt {
	public int bodX;
	public int bodY;
	
	public abstract void vykresli();
	
	public int getBodX() {
		return bodX;
	}
	public void setBodX(int bodX) {
		this.bodX = bodX;
	}
	public int getBodY() {
		return bodY;
	}
	public void setBodY(int bodY) {
		this.bodY = bodY;
	}
}
