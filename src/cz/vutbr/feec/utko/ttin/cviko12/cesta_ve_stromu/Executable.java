package cz.vutbr.feec.utko.ttin.cviko12.cesta_ve_stromu;

/**
 * Created by ogajduse on 4/25/17.
 */
public class Executable {
    public static void main(String[] args) {
        Uzel root = new Uzel(null, null, null, 1);

        Uzel osm = new Uzel(root, null, null, 8);
        osm.getRodic().setLevy(osm);

        Uzel sedm = new Uzel(root, null, null, 7);
        sedm.getRodic().setPravy(sedm);

        Uzel minusjedna = new Uzel(osm, null, null, -1);
        minusjedna.getRodic().setLevy(minusjedna);

        Uzel tri = new Uzel(osm, null, null, 3);
        tri.getRodic().setPravy(tri);

    }
}
