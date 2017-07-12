package sklad;

import java.util.HashMap;

public class Sklad {
	private HashMap<String, Polozka> polozka = new HashMap<>();

	public void pridej(String zbozi, int ks, double cena) {
		if (polozka.containsKey(zbozi)) {
			polozka.get(zbozi).secti(ks);
		} else {
			
		}
		
	}
}
