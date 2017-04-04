package cz.vutbr.feec.utko.ttin.cviko3.exam2;

import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.ArrayList;

/**
 * Created by ogajduse on 2/21/17.
 */
public class HraciPole implements Comparable<HraciPole>{
    private int[][] pole = new int[][]{{4, 1, 2}, {3, 0, 5}, {6, 7, 8}};
    private int prazdneX;
    private int prazdneY;
    private ArrayList<Integer> pohyby = new ArrayList<Integer>();

    public static final int NAHORU = 1;
    public static final int DOLU = 2;
    public static final int DOLEVA = 3;
    public static final int DOPRAVA = 4;

    public HraciPole klonujAPohni(int smer) {
        HraciPole nove = new HraciPole();
        nove.prazdneX = this.prazdneX;
        nove.prazdneY = this.prazdneY;
        nove.pohyby.addAll(this.pohyby);
        nove.pohyby.add(smer);
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                nove.pole[x][y] = this.pole[x][y];
            }
        }

        boolean jeMozny = nove.posun(smer);
        if (jeMozny) {
            return nove;
        } else {
            return null;
        }
    }

    public boolean posun(int i) {
        switch (i) {
            case NAHORU:
                if (prazdneY < 1) {
                    return false;
                }
                pole[prazdneX][prazdneY] = pole[prazdneX][prazdneY - 1];
                pole[prazdneX][prazdneY - 1] = 0;
                prazdneY--;
                return true;
            case DOLU:
                if (prazdneY > 1) {
                    return false;
                }
                pole[prazdneX][prazdneY] = pole[prazdneX][prazdneY + 1];
                pole[prazdneX][prazdneY + 1] = 0;
                prazdneY++;
                return true;
            case DOLEVA:
                if (prazdneX < 1) {
                    return false;
                }
                pole[prazdneX][prazdneY] = pole[prazdneX - 1][prazdneY];
                pole[prazdneX - 1][prazdneY] = 0;
                prazdneX--;
                return true;
            case DOPRAVA:
                if (prazdneX > 1) {
                    return false;
                }
                pole[prazdneX][prazdneY] = pole[prazdneX + 1][prazdneY];
                pole[prazdneX + 1][prazdneY] = 0;
                prazdneX++;
                return true;
            default:
                return false;

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

    @Override
    public int hashCode() {
        HashCodeBuilder h = new HashCodeBuilder();
        for (int x = 0; x < pole.length; x++) {
            for (int y = 0; y < pole[0].length; y++) {
                h.append(pole[x][y]);
            }
        }
        return h.toHashCode();
    }

    public int compareTo(HraciPole p) {
        for (int ix = 0; ix < 3; ix++) {
            for (int iy = 0; iy < 3; iy++) {
                if (pole[ix][iy] == p.pole[ix][iy]) {
                    continue;
                } else if (pole[ix][iy] < p.pole[ix][iy]) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        HraciPole p = (HraciPole) obj;
        return compareTo(p) == 0;
    }

    public boolean jeReseni() {
        int[][] reseni = {{1, 4, 7}, {2, 5, 8}, {3, 6, 0}};
        for (int x = 0; x < reseni.length; x++) {
            for (int y = 0; y < reseni[0].length; y++) {
                if (pole[x][y] != reseni[x][y]) {
                    return false;
                }
            }
        }
        return true;
    }
}
