package cv03_zadani1;

public class Spustitelna {
	public static void main(String[] args) {
		Kruh k1 = new Kruh(1,2,5);
		Kruh k2 = new Kruh(5,3,4);
		
		Ctverec c1 = new Ctverec(5, 5, 9);
		
		Slozenina s = new Slozenina(10, 10);
		s.pridej(new Kruh(20,20,5));
		s.pridej(new Ctverec(50,20,5));		
		
		k1.vykresli();
		s.vykresli();
	}
}
