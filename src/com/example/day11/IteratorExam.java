package com.example.day11;

import java.util.*;

public class IteratorExam {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        for(String s: list)
            System.out.println(s);

        System.out.println("-----------------");

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("-----------------");

        // set은 순서가 없기 때문에 인덱스로 접근 X
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        Iterator<String> setIter = set.iterator();
        while (setIter.hasNext()) {
            System.out.println(setIter.next());
        }

        System.out.println("-----------------");

        for(String s: set)
            System.out.println(s);
    }
}
