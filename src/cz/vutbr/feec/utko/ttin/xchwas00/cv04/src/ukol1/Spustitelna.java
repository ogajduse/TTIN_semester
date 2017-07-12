package ukol1;

public class Spustitelna {

	public static void main(String[] args) {
		LinearniSeznam<String> seznam = new LinearniSeznam<String>();
		seznam.pridejNaZacatek(2);
		seznam.pridejNaZacatek(5);
		seznam.pridejNaZacatek(8);
		seznam.pridejNaZacatek(3);
		
		System.out.println(seznam.obsahuje(5));
		System.out.println(seznam.obsahuje(9));
		
		seznam.odstranZeZacatku();
		seznam.odstranZeZacatku();
		seznam.odstranZeZacatku();		
		System.out.println(seznam.obsahuje(5));
		System.out.println(seznam.obsahuje(2));

	}

}
