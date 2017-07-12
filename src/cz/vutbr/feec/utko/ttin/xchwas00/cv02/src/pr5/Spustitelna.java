package pr5;

public class Spustitelna {
	
	public static void main(String[] args) {
		Uzel u1 = new Uzel();
		Uzel u2 = new Uzel();
		Uzel u3 = new Uzel();
		Uzel u4 = new Uzel();
		Uzel u5 = new Uzel();
		Uzel u6 = new Uzel();
		
		u1.pridejSouseda(u4);
		u1.pridejSouseda(u2);
		u1.pridejSouseda(u6);
		u1.pridejSouseda(u5);
		u2.pridejSouseda(u5);
		u2.pridejSouseda(u3);
		
		
	}
	
	
		
}
