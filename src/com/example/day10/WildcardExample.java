package com.example.day10;

import java.util.Arrays;
import java.util.List;

public class WildcardExample {
    public static  void printList(List<?> list) {
        for (Object obj: list) {
            System.out.println(obj);
        }
//        list.add(1);  // 컴파일 오류: ?는 알 수 없는 타입, T로 설정 시 메소드 호출 시점에서 타입 결정
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> strList = Arrays.asList("hi", "hello");

        printList(intList);
        printList(strList);
    }
}
