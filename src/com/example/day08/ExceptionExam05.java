package com.example.day08;

public class ExceptionExam05 {
    public static void task() throws RuntimeException { // Exception으로 던지만 main의 task에서 오류
        System.out.println("Task start!");

        int i = 0;
        System.out.println(10 / i);

        System.out.println("Task end!");
    }

    public static void main(String[] args) {
        task();
    }
}
