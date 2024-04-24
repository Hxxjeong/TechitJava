package com.example.day16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExam2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 2, 5, 7);

        // 익명 객체 사용
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        });

        // 람다식 사용
        Collections.sort(numbers, (a, b) -> a.compareTo(b));

        numbers.forEach(num -> System.out.println(num));
    }
}
