package ukol1;

public class LinearniSeznam<T> {	
	private Polozka prvni;

	public void pridejNaZacatek(int data) {
		if (prvni==null) {
			Polozka novaPolozka = new Polozka(data);
			prvni = novaPolozka;	
		}
		else {
			Polozka novaPolozka = new Polozka(data);
			novaPolozka.setDalsi(prvni);
			prvni = novaPolozka;
		}		
	}

	public void odstranZeZacatku() {
		prvni = prvni.getDalsi();
		
	}

	public boolean obsahuje(int hledane) {
		Polozka testovany=prvni;
		while (testovany!=null) {
			if (testovany.getData()==hledane) {
				return true;
			}
			testovany=testovany.getDalsi();
		}
		return false;
	}
	
}
