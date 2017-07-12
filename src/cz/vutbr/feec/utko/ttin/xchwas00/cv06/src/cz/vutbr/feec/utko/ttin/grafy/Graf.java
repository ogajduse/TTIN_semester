package cz.vutbr.feec.utko.ttin.grafy;

import java.util.HashMap;

public class Graf {
	private HashMap<String, Uzel> mapa = new HashMap<>();
	
	public void pridej(String src, String dst, int cena){		
		Uzel srcUzel = mapa.get(src);
		Uzel dstUzel = mapa.get(dst);
		if (srcUzel != null && dstUzel != null && srcUzel.getSousedi().contains(dstUzel)) {
			System.out.println("Cesta jiz existuje!");
			return;
		}		
		if (srcUzel == null){
			srcUzel = new Uzel(src);
			mapa.put(src, srcUzel);
		}
		if (dstUzel == null) {
			dstUzel = new Uzel(dst);
			mapa.put(dst, dstUzel);
		}
		Hrana novaHrana = new Hrana(srcUzel, dstUzel, cena);
		srcUzel.pridejHranu(novaHrana);
		dstUzel.pridejHranu(novaHrana);
		
	}
	
	public Uzel vratUzel(String identifikator){
		return mapa.get(identifikator);		
	}
}