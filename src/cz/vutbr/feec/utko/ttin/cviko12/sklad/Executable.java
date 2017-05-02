package cz.vutbr.feec.utko.ttin.cviko12.sklad;

/**
 * Created by ogajduse on 4/25/17.
 */
public class Executable {
    public static void main(String[] args) {
        Zbozi telefon = new Zbozi("2k84p9", 3000);
        Zbozi laptop = new Zbozi("7z03i1", 30000);
        Zbozi obal = new Zbozi("i245op", 333);

        Sklad mujsklad = new Sklad();
        mujsklad.addZbozi(telefon, 2);
        mujsklad.addZbozi(laptop, 2);
        mujsklad.addZbozi(obal,2);
        System.out.println(mujsklad.cenaSkladu());

    }




}
