package com.example.day13.실습문제;

public class CounterApp {
    public static void main(String[] args) {
        Thread increment = new Thread(new IncrementCounter());
        Thread decrement = new Thread(new DecrementCounter());

        increment.start();
        decrement.start();
    }
}
