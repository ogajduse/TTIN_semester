package sklad;

public class Spustitelna {
	public static void main(String[] args) {
	Sklad s = new Sklad();
	s.pridej("A001", 20, 123);
	s.pridej("A002", 30, 145);

	System.out.println(s.secti());
	}
}
