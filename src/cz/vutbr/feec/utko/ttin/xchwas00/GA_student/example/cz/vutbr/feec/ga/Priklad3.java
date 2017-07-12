package cz.vutbr.feec.ga;

import java.io.IOException;

/**
 * Tento priklad ukazuje jak klonovat chromozom.
 */
public class Priklad3 {
	public static void main(String[] args) throws IOException {
		// Priklad 1
		Chromozome ch1 = new Chromozome();
		ch1.mutateAll();

		// vytvoreni kopie
		//Chromozome ch2 = ch1.cloneChromozome();
		// Chromozome ch2 = ch1; // nevytvori kopii
		ch1.mutateAll();
		ShowChromozome.show(ch1.cloneChromozome(), "Chromozom ch1");
		ch1.mutateAll();
		ShowChromozome.show(ch1.cloneChromozome(), "Chromozom ch2");
	}
}
