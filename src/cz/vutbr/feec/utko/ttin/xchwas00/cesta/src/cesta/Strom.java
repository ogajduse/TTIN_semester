package cesta;

import java.util.TreeMap;

public class Strom {
	private TreeMap<String, Uzel> strom = new TreeMap<>();
	
	public void pridej(Uzel uzel){
		strom.put(uzel.hodnota);
		
	}
}
