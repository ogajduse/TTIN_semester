package cz.vutbr.feec.utko.ttin.cviko7.elearningImport.example;

import cz.vutbr.feec.utko.ttin.cviko3.exam2.HraciPole;

public class P09VypsaniTahuReseni {
    public static void main(String[] args) {
        HraciPole h = new HraciPole();
        System.out.println("" + h + h.jeReseni());

        System.out.println(); // odradkuj
        h = h.klonujAPohni(1);
        h = h.klonujAPohni(2);
        System.out.println("" + h + h.jeReseni());
    }
}
