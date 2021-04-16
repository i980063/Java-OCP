package com.ocp.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        List<Integer> lotto = new ArrayList<>();
        lotto.add(2); // 0
        lotto.add(1); // 1
        lotto.add(4); // 2
        lotto.add(3); // 3
        lotto.add(5); // 4
        System.out.println(lotto);
        ListIterator<Integer> iter = lotto.listIterator();
        while (iter.hasNext()) {
            int idx = iter.nextIndex();
            int value = iter.next();
            System.out.printf("[%d] : %d\n",idx,value);
        }
        
    }
}
