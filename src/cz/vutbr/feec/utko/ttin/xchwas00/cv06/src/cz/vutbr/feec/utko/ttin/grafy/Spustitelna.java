package cz.vutbr.feec.utko.ttin.grafy;

public class Spustitelna {

	public static void main(String[] args) {
		Graf g = new Graf();
		
		g.pridej("1", "6", 6);
		g.pridej("1", "2", 4);
		g.pridej("1", "7", 16);
		g.pridej("2", "3", 24);
		g.pridej("6", "3", 23);
		g.pridej("6", "7", 8);
		g.pridej("6", "5", 5);
		g.pridej("7", "5", 10);
		g.pridej("7", "8", 21);
		
		Cesta c = new Cesta(g);
		c.pridejUzel("1");
		c.pridejUzel("6");
		c.pridejUzel("5");
		
		System.out.println(c.getCena());
		
		System.out.println("Puvodni: A-E-B cost=" + c.getCena());
		for (Hrana u : c.getPosledniUzel().getSousedi()) {
			Cesta kopie = c.cloneAndAddNode(u.getnazevuzlu);
			String nazevuzlu = kopie.getPosledniUzel().getCislo();
			System.out.println("Kopie: A-E-B" + nazevuzlu + " cena=" + kopie.getCena());
		}
		//Djikstra d = new Djikstra(g);
	}

}
