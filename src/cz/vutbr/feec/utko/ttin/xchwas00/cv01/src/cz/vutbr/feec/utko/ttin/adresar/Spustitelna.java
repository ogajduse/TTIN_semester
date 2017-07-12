package cz.vutbr.feec.utko.ttin.adresar;

public class Spustitelna {

	public static void main(String[] args) {
		Adresar a1 = new Adresar("adr1");
		Adresar a2 = new Adresar("adr2");
		Adresar a3 = new Adresar("adr3");
		Adresar a4 = new Adresar("adr4");
		Adresar a5 = new Adresar("adr5");
		
		a1.levy = a4;
		a1.pravy = a2;
		a2.levy = a5;
		a2.pravy = a3;
		
		
		
		

	}

}
