package com.example.day08;

public class ExceptionExam04 {
    public static void task() {
        System.out.println("Task start!");

        int i = 0;
        try {
            System.out.println(10 / i);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Task end!");
    }

    public static void main(String[] args) {
        task();
    }
}
