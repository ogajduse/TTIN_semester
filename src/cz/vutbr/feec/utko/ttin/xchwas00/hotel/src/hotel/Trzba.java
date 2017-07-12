package hotel;

import java.util.HashMap;

public class Trzba {
	private HashMap<String, Rezervace> h = new HashMap<>();
	
	
	public int cena(Rezervace rezervace){
		int platba = rezervace.getPocetNoci() * 5000;
		return platba;
	}
}
