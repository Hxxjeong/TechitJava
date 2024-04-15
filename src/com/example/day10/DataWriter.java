package com.example.day10;

import java.util.ArrayList;
import java.util.List;

public class DataWriter {
    // 하한 사용 (super), Integer의 조상 타입 가능
    public static void addNumbers(List<? super Integer> list) {
        for (int i=1; i<=5; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        addNumbers(numList);
        addNumbers(objList);

        System.out.println(numList);
        System.out.println(objList);
    }
}
