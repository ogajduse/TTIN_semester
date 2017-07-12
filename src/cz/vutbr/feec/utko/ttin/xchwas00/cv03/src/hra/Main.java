package hra;

import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
	Pole p = new Pole();
	
	p.posunNahoru();
	System.out.println(p);
	// System.out.println(p);
	
	Pole p2 = new Pole();
	System.out.println(p2);
	
	Pole p3 = new Pole();
	System.out.println(p3);
	
	TreeSet<Pole> mn = new TreeSet<Pole>();
	mn.add(p);
	mn.add(p2);
	mn.add(p3);
	
	System.out.println(mn.size());
	}
}