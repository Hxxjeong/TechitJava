package com.example.day07.실습문제;

public class BurgerOrder extends Order {
    @Override
    void prepareFood() {
        System.out.println("버거 준비");
    }

    @Override
    void serveFood() {
        System.out.println("버거 제공");
    }
}
