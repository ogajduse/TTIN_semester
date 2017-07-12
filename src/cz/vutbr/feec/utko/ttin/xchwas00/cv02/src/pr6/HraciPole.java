package pr6;

public class HraciPole {
	private int[][] pole = new int [][] {{0,1,2}, {3,4,5}, {6,7,8}};
	private int x = 0;
	private int y = 0;
	public static final int NAHORU = 0;
	public static final int DOLU = 1;
	public static final int DOLEVA = 2;
	public static final int DOPRAVA = 3;
	
	public void posun(int smer){
		switch (smer) {
		case NAHORU:
			pole[x][y] =pole[x][y+1];
			pole[x][y+1]= 0;
			y--;
			break;
		case DOLU:
			pole[x][y] =pole[x][y-1];
			pole[x][y-1]= 0;
			y++;
			break;
		case DOLEVA:
			pole[x][y] =pole[x+1][y];
			pole[x+1][y]= 0;
			x--;
			break;
		case DOPRAVA:
			pole[x][y] =pole[x-1][y];
			pole[x-1][y]= 0;
			x++;
			break;
		default:
			break;
		}
		
	}
}
