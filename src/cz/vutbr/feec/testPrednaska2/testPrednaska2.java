package cz.vutbr.feec.testPrednaska2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by ogajduse on 2/19/17.
 */
public class testPrednaska2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                list.addFirst(j);
                set.add(j);
            }
        }

    }
}
