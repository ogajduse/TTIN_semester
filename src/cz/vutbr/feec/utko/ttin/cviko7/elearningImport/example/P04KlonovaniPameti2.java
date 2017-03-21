package cz.vutbr.feec.utko.ttin.cviko7.elearningImport.example;

import cz.vutbr.feec.utko.ttin.cviko3.exam2.HraciPole;

public class P04KlonovaniPameti2 {
	public static void main(String[] args) {
		HraciPole g = new HraciPole();
		System.out.println("Original: \n" + g);

		for (int i = 1; i <= 4; i++) {
			HraciPole g3 = g.klonujAPohni(i);
			System.out.println("Kopie s pohybem "+i+ " je: \n"+g3);
		}
	}
}
