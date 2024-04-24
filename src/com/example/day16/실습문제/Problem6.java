package com.example.day16.실습문제;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Problem6 {
    public static void main(String[] args) {
        /*
        문제 6: 모든 요소에 대해 조건 확인하기
        주어진 List<Integer>의 모든 요소가 짝수인지 확인하라. 람다식을 활용하여 조건 검사를 수행하고 결과를 출력하라.
         */
        List<Integer> numbers = Arrays.asList(1, 5, 6, 9, 3, 4);
        Predicate<Integer> checkEven = i -> i%2 == 0;
        for(Integer i: numbers) {
            if(!checkEven.test(i)) {
                System.out.println("모든 요소가 짝수가 아닙니다.");
                break;
            }
            else
                System.out.println("모든 요소가 짝수 입니다.");
        }
    }
}
