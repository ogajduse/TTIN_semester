package stromRekurze;

public class Spustitelna {
	public static void main(String[] args) {
		Uzel u1 = new Uzel(1);
		Uzel u6 = new Uzel(6);
		Uzel u3 = new Uzel(3);
		Uzel um1 = new Uzel(-1);
		Uzel u33 = new Uzel(3);
		
		u1.setLevy(u6);
		u1.setPravy(u3);
		u6.setLevy(um1);
		u6.setPravy(u33);
		
		System.out.println(u1.secti());
	}
}
