package com.example.day16;

public class MyFunctionalInterfaceTest3 {
    public static void main(String[] args) {
        MyFunctionalInterface3 fis3 = ((x, y) -> x-y);
        System.out.println(fis3.method(10, 5));
    }
}
