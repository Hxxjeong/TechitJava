package com.example.main;

import com.example.util.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int p = cal.plus(1, 2);
        int m = cal.minus(6, 4);
        System.out.println(p);
        System.out.println(m);
    }
}
