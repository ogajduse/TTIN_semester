package cz.vutbr.feec.utko.ttin;

public class Spustitelna2 {
	public static void main(String[] args) {
		Auto a1 = new Auto(10, 20, "Skoda");
		Auto a2 = new Auto(10, 20, "Audi");
		Auto a3 = new Auto(10, 20, "Ferrari");
		Auto a4 = new Auto(10, 20, "BMW");
		
		Mapa m = new Mapa();
		m.pridejAuto(a1);
		m.pridejAuto(a2);
		m.pridejAuto(a3);
		m.pridejAuto(a4);
		
		m.getPocetAut();
		
		Auto a5 = m.getAuto(1);
		m.odstranAuto(1);
		m.vypisVsechnaAuta();
	}
	
}
