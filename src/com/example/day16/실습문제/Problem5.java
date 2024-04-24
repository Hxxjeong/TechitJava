package com.example.day16.실습문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Problem5 {
    public static void main(String[] args) {
        /*
        문제 5: 요소 변환하기
        주어진 List<Integer>의 각 요소를 제곱한 결과를 새 리스트에 저장하고 출력하라. for 루프와 람다식을 활용하여 각 요소를 변환하라.
         */
        List<Integer> number = Arrays.asList(1, 5, 6, 9, 3);
        Function<Integer, Integer> square = i -> i * i;
        List<Integer> squareNumber = new ArrayList<>();
        for(Integer i: number) {
            squareNumber.add(square.apply(i));
        }
        System.out.println(squareNumber);
    }
}
