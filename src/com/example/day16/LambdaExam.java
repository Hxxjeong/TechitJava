package com.example.day16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExam {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Apple", "Banana", "Cherry");

        // Consumer: accept 메소드 하나만을 가지는 인터페이스
        Consumer<String> lambdaTest = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        items.forEach(item -> System.out.println(item));
        items.forEach(lambdaTest);
        items.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hi");
            }
        }).start();

        new Thread(() -> System.out.println("hi")).start();
    }
}
