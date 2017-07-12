package hra;

import java.nio.InvalidMarkException;

public class Pole implements Comparable<Pole> {
	private int[][] cisla;
	private int x;
	private int y;
	public Pole() {
		cisla = new int[][]{{1,2,3},{4,5,6},{7,8,-1}};
		x = 2;
		y = 2;
	}
	
	public Pole(int[][] pole) {
		this.cisla = pole;
	}
	
	public void posunNahoru() {
		if(y <= 0 ) {
		throw new IvalidMoveException();
		}
	int tmp = cisla[y-1][x];
	cisla[y-1][x] = cisla[y][x];
	cisla[y][x] = tmp;
	y = y-1;
	}
	
	@Override
	public String toString() {
	String res = "";
		for (int y = 0; y < cisla.length; y++) {
			for (int x = 0; x < cisla[0].length; x++) {
				System.out.print(cisla[y][x] + " ");
			}
		System.out.println();
	}
	return res;
	}
	
	@Override
	public int compareTo(Pole o) {
		for (int y = 0; y < cisla.length; y++) {
			for (int x = 0; x < cisla[0].length; x++) {
				if(cisla[y][x] < o.cisla[y][x]) {
				return -1;
					} else if(cisla[y][x] > o.cisla[y][x]) {
					return 1;
					}
				}
			}
		return 0;
		}
}
