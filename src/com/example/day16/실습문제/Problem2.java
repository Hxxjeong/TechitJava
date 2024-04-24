package com.example.day16.실습문제;

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        /*
        문제 2: 최대값 찾기
        주어진 정수 배열에서 최대값을 찾아 출력하라. 람다식을 사용하여 자바의 Comparator 인터페이스와 함께 Arrays.sort()를 활용하라.
         */
        Integer[] num = {1, 5, 6, 9, 3};
        Arrays.sort(num, (i1, i2) -> i2 - i1);
        System.out.println(num[0]);
    }
}
