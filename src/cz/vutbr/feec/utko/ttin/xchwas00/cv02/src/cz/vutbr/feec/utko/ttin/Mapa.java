package cz.vutbr.feec.utko.ttin;

import java.util.Vector;

import cz.vutbr.feec.utko.ttin.Auto;

public class Mapa {
	public Vector <Auto> mojeAuto = new Vector<>();

	public void pridejAuto(Auto a1) {
		mojeAuto.add(a1);
		
	}

	public int getPocetAut() {
		return mojeAuto.size();
	}

	public Auto getAuto(int index) {
		return mojeAuto.get(index);
	}

	public void odstranAuto(int index) {
		mojeAuto.remove(index);
		
	}

	public void vypisVsechnaAuta() {
		for (Auto auto : mojeAuto) {
			System.out.println(auto.getZnacka());
		}
	}
}
