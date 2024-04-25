package com.example.day17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // forEach
        numbers.stream()
                .forEach(n -> System.out.println("number: " + n));

        // peek
        List<Integer> doubleNumbers = numbers.stream()
                .peek(n -> System.out.println("before process: " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("after process: " + n))
                .collect(Collectors.toList());
        System.out.println(doubleNumbers);
    }
}
