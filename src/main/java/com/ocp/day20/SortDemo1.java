package com.ocp.day20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 80, 90);// unrditable list
        System.out.println(list);
        //排序(自然排序:小到大)
        Collections.sort(list);
        System.out.println(list);
        //排序(大到小)
        Collections.sort(list, c);
    }
}
