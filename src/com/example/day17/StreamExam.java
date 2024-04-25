package com.example.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("asef", "bee", "css", "asap", "d");

        // a로 시작하는 원소 필터링
        List<String> filterList = list.stream()
                .filter(s -> s.startsWith("a")) // 필더링
                .collect(Collectors.toList());  // 리스트로 반환
        System.out.println(filterList);

        // 스트림 사용 X
        List<String> filteredList = new ArrayList<>();
        for(String s: list) {
            if(s.startsWith("a"))
                filteredList.add(s);
        }
        System.out.println(filteredList);

        String[] names = {"kim", "lee", "park", "choi"};
        // 스트림을 이용하여 배열 내용 출력
        Arrays.stream(names).forEach(System.out::println);
//        Arrays.stream(names).forEach(s -> System.out.println(s));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        // 짝수만 출력
        Arrays.stream(arr).filter(i -> i%2==0).forEach(System.out::println);
    }
}
