package cz.vutbr.feec.cviko3.exam2;

import java.util.Arrays;

/**
 * Created by ogajduse on 2/21/17.
 */
public class HraciPole {
    private int[][] pole = new int[][]{{4, 1, 2}, {3, 0, 5}, {6, 7, 8}};
    private int prazdneX;
    private int prazdneY;

    public static final int NAHORU = 0;
    public static final int DOLU = 1;
    public static final int DOLEVA = 2;
    public static final int DOPRAVA = 3;

    public void posun(int i) {
        switch (i) {
            case NAHORU:
                pole[prazdneX][prazdneY] = pole[prazdneX - 1][prazdneY];
                pole[prazdneX + -1][prazdneY] = 0;
                prazdneX--;
                break;
            case DOLU:
                pole[prazdneX][prazdneY] = pole[prazdneX + 1][prazdneY];
                pole[prazdneX + 1][prazdneY] = 0;
                prazdneX++;
                break;
            case DOLEVA:
                pole[prazdneX][prazdneY] = pole[prazdneX][prazdneY - 1];
                pole[prazdneX][prazdneY - 1] = 0;
                prazdneY--;
                break;
            case DOPRAVA:
                pole[prazdneX][prazdneY] = pole[prazdneX][prazdneY + 1];
                pole[prazdneX][prazdneY + 1] = 0;
                prazdneY++;
                break;
            default:
                break;

        }
    }

    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                text += " " + pole[i][j];
            text += '\n';
        }

        return text;
    }
    
    
    
    public boolean hashCode(HraciPole obj){
        for (int i = 0; i < 3; i++) {
            
        }
    }

    public int compareTo(HraciPole obj) {
        int h1 = hashCode();
        int h2 = obj.hashCode();

        return Integer.compare(h1, h2);
    }
}