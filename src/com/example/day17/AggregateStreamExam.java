package com.example.day17;

import java.util.Arrays;

public class AggregateStreamExam {
    public static void main(String[] args) {
        int[] ints = {1, 2, 135, 59, 46};

        long count = Arrays.stream(ints).boxed().count();
        int max = Arrays.stream(ints)
                .boxed()
                .max(Integer::compareTo).orElse(0); // orElse: 값이 없을 때 디폴트 값
        int min = Arrays.stream(ints)
                .boxed()
                .min(Integer::compareTo).orElse(0);
        double avg = Arrays.stream(ints)
                .average()
                .getAsDouble(); // orElse로 처리 가능
        int sum = Arrays.stream(ints)
                        .sum();

        System.out.println("count: " + count);
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("average: " + avg);
        System.out.println("sum: " + sum);
    }
}
