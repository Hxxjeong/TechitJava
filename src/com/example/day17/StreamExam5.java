package com.example.day17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam5 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Cherry", "Date");

        // 오름차순 정렬
        List<String> sortedList = fruits.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);

        // 내림차순 정렬
        List<String> reverseSortedList = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverseSortedList);

        int[] arr = {5,3,27,9,5,9,0,4,34};
        Arrays.stream(arr)
                .sorted()
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        Arrays.stream(arr)
                .boxed()    // 기본형 타입을 참조형으로 변환 (Stream<Integer>)
                .sorted(Comparator.reverseOrder())  // 제네릭 타입 기본형 X
                .forEach(s -> System.out.print(s + " "));
    }
}
