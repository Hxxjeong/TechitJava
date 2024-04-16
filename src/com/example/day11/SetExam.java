package com.example.day11;

import java.util.HashSet;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set);

        set.add("a");
        System.out.println(set);    // 중복 요소 X

        Set<Pen> penSet = new HashSet<>();
        penSet.add(new Pen("red"));
        penSet.add(new Pen("blue"));
        penSet.add(new Pen("black"));
        System.out.println(penSet);

        penSet.add(new Pen("red")); // 주소를 비교하기 떄문에 추가됨 (Pen에서 equals를 구현하면 추가되지 않음)
        System.out.println(penSet);
    }
}
