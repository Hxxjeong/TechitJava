package com.example.day16;

public class MyFunctionalInterfaceTest2 {
    public static void main(String[] args) {
        MyFunctionalInterface2 fi2 = new MyFunctionalInterface2() {
            @Override
            public void method(int x) {
                int result = x * 5;
                System.out.println(result);
            }
        };
        fi2.method(10);

        fi2 = x -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi2.method(6);
    }
}
