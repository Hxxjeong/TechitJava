package com.example.day07.interfaceExam;

public interface Calculator {
    static int plus(int a, int b) {
        return a + b;
    }
    static int minus(int a, int b) {
        return a - b;
    }

    // static 메소드로 선언 시 구현 필요
    static void light() {
        System.out.println("LIGHT!!");
    }
}
