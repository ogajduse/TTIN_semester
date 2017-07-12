package cz.vutbr.feec.ga;

public class GA {
	public static void main(String[] args) {
		Populace p = new Populace();
		p.initPopulace(20);

		for (int g = 1; g < 100; g++) {
			p.krizeni(0.5);
			p.mutace(0.2);
			
			p.ohodnotit();
			p.selekce(20);
			
			Chromozome best = p.getBest();
			ShowChromozome.show(best, "Best " + g);
			
		}
	}
}
