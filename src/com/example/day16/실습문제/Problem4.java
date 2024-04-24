package com.example.day16.실습문제;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Problem4 {
    public static void main(String[] args) {
        /*
        문제 4: 조건에 맞는 요소 찾기
        주어진 List<String>에서 글자 수가 5 이상인 첫 번째 단어를 찾아 출력하라. for 루프와 람다식을 활용하여 조건에 맞는 요소를 찾아보세요.
         */
        List<String> strLists = Arrays.asList("C++", "Python", "Kotlin", "C", "Java");
        Predicate<String> findOverFive = s -> s.length() >= 5;
        for(String s: strLists) {
            if(findOverFive.test(s)) {
                System.out.println(s);
                break;
            }
        }
    }
}
