package com.example.day17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Apple", "Cherry", "Date");
        // 글자 수가 5 이상인 단어 출력 (중복 제거)
        List<String> overFiveLength = words.stream()
                .filter(s -> s.length() >= 5)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(overFiveLength);

        // 모든 문자를 대문자로 출력
        words.stream()
                .map(w -> w.toUpperCase())
                .forEach(System.out::println);

        int[] arr = {3, 5, 49, 1, 22};
        // 각 요소에 3을 곱해서 출력
        Arrays.stream(arr)
                .map(i -> i * 3)
                .forEach(System.out::println);
    }
}
