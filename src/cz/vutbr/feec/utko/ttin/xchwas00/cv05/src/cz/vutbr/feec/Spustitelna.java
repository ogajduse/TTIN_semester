package cz.vutbr.feec;

public class Spustitelna {
	public static void main(String[] args) {
		Strom strom = new Strom();
		strom.jePrazdny();
		strom.pridej(5);
		strom.pridej(7);
		strom.pridej(2);
		strom.pridej(1);
		strom.obsahuje(2);
		strom.obsahuje(8);
	}	
}
