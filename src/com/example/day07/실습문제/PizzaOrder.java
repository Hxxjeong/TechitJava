package com.example.day07.실습문제;

public class PizzaOrder extends Order {
    @Override
    void prepareFood() {
        System.out.println("피자 준비");
    }

    @Override
    void serveFood() {
        System.out.println("피자 제공");
    }
}
