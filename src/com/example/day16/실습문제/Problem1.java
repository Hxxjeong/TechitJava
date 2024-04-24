package com.example.day16.실습문제;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        /*
        문제 1: 문자열 리스트 정렬하기
        주어진 List<String>을 문자열 길이에 따라 정렬하되, 람다식을 사용하여 Collections.sort() 메서드를 활용하라.
         */
        List<String> strList = Arrays.asList("C++", "Python", "Kotlin", "C", "Java");
        Collections.sort(strList, (s1, s2) -> s1.length() - s2.length());
        System.out.println(strList);
    }
}
