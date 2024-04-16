package com.example.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        fruits.get(0);  // 얻어오기
        fruits.set(1, "pineapple"); // 수정
        fruits.remove("cherry");    // 삭제, 인덱스로도 삭제 가능

        System.out.println(fruits);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("HI");
        linkedList.add("HELLO");
        linkedList.add("HIPPO");

        linkedList.removeFirst();

        System.out.println(linkedList);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
