package com.example.day10;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    public static void main(String[] args) {
        List list = new ArrayList<>();  // 타입 명시를 하지 않은 경우
        list.add("test");   // Object Type
        list.add(10);

        System.out.println(list);   // toString() Overriding
        Integer i = (Integer) list.get(1);  // unboxing (Object to Integer)
        System.out.println(i);
        int i1 = (int) list.get(1);
        System.out.println(i1);

        List<String> strList = new ArrayList<>(); // Generic
        strList.add("hello");
        String str = strList.get(0);    // 제네릭을 사용하면 형변환 X
    }
}
