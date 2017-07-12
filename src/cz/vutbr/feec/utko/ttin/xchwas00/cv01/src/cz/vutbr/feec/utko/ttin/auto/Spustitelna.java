package cz.vutbr.feec.utko.ttin.auto;

public class Spustitelna {
	public static void main(String[] args) {
		
		Auto a1 = new Auto();
		a1.cena = 100;
		Auto a2 = new Auto();
		a2.cena = 200;
		Auto a3 = new Auto();
		a3.cena = 300;
		Auto a4 = new Auto();
		a4.cena = 400;
		Auto a5 = a4;
		
		System.out.println(a5.cena);
		
		Mapa map = new Mapa();
		map.auto1 = a1;
		map.auto2 = new Auto();
	}
}
