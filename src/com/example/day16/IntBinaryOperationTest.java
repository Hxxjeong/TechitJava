package com.example.day16;

public class IntBinaryOperationTest {
    public static void main(String[] args) {
        IntBinaryOperation add = ((a, b) -> a + b);
        IntBinaryOperation minus = ((a, b) -> a - b);
        IntBinaryOperation product = ((a, b) -> a * b);
        IntBinaryOperation division = ((a, b) -> a / b);

        System.out.println(add.apply(1, 5));
        System.out.println(minus.apply(3, 9));
        System.out.println(product.apply(5, 9));
        System.out.println(division.apply(8, 3));
    }
}
