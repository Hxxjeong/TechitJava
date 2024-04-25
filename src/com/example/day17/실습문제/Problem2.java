package com.example.day17.실습문제;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        // 길이가 5 이상인 문자열 대문자 리스트로 반환
        List<String> overFiveUpper = words.stream()
                .filter(s -> s.length() >= 5)
                .map(upper -> upper.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(overFiveUpper);
    }
}
