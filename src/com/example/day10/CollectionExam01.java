package com.example.day10;

import java.util.ArrayList;
import java.util.List;

public class CollectionExam01 {
    public static void main(String[] args) {
        // ArrayList: 가변길이
        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");

        System.out.println(strList);
        strList.size();

        for(String s: strList) {
            System.out.println(s);
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2); // 2번 인덱스를 지우기
        System.out.println(list);
        list.remove(Integer.valueOf(2));    // 값이 2를 지우기
        System.out.println(list);
    }
}
