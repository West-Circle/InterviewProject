package org.interview.common.code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayIterator {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        // or another for method
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // arraylist
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        // normal for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        // iterator
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
    }
}
