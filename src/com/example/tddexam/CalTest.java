package com.example.tddexam;

public class CalTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.plus(10, 20);

        System.out.println(result);

        System.out.println(cal.plus(3, 5));

        System.out.println(cal.minus(20, 10));
    }
}
