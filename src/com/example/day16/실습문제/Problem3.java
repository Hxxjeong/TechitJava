package com.example.day16.실습문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3 {
    public static void main(String[] args) {
        /*
        문제 3: 리스트의 각 요소에 연산 적용하기
        주어진 List<Integer>의 각 요소에 10을 더한 결과를 새 리스트에 저장하고 출력하라. 람다식을 사용하여 List의 forEach() 메서드를 활용하라.
         */
        List<Integer> numList = Arrays.asList(1, 5, 4, 9, 8);
        List<Integer> plusTen = new ArrayList<>();
        numList.forEach(n -> plusTen.add(n + 10));
        System.out.println(plusTen);
    }
}
