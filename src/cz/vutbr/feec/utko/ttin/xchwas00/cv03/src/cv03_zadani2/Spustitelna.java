package cv03_zadani2;

import java.util.HashSet;

public class Spustitelna {

	public static void main(String[] args) {
		HashSet<HraciPole> mnozina = new HashSet<>();
		HraciPole hra1 = new HraciPole();
		mnozina.add(hra1);
		
		HraciPole hra2 = new HraciPole();
		hra2.posun(1);
		hra2.posun(3);
		
		mnozina.add(hra2);
		System.out.println(mnozina.size());
		
	}

}
