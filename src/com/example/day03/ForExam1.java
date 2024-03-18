package com.example.day03;

public class ForExam1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }

        int sum = 0;
        // 1~100의 짝수의 합
        for (int i = 1; i <= 100; i+=2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
