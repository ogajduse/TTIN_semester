package cz.vutbr.feec.utko.ttin.cviko7.elearningImport.example;

import cz.vutbr.feec.utko.ttin.cviko3.exam2.HraciPole;

import java.util.LinkedList;

public class P07Fronta {
    public static void main(String[] args) {
        HraciPole h1 = new HraciPole();
        HraciPole h2 = new HraciPole();

        LinkedList<HraciPole> fronta = new LinkedList<HraciPole>();
        fronta.addLast(h1);
        fronta.addLast(h2);

        while (!fronta.isEmpty()) {
            System.out.println(fronta.remove());
        }
    }
}
