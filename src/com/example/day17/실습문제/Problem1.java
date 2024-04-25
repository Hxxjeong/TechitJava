package com.example.day17.실습문제;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] numbers = {3, 10, 4, 17, 6};

        // 짝수의 합
        int sum = Arrays.stream(numbers)
                .filter(i -> i % 2 == 0)
                .sum();
        System.out.println(sum);
    }
}
