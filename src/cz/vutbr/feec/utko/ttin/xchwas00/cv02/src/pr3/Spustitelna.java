package pr3;

public class Spustitelna {
	public static void main(String[] args) {
		Paket p1 = new Paket();
		Paket p2 = new Paket();
		Paket p3 = new Paket();
		Paket p4 = new Paket();
		
		p1.setDalsi(p2);
		p2.setDalsi(p3);
		p3.setDalsi(p4);
		
		Paket pomocna = p1;
		while (pomocna != null) {
			System.out.println(pomocna);
			pomocna = pomocna.getDalsi();			
		}
	}
}
