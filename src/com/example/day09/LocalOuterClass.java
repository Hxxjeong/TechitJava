package com.example.day09;

public class LocalOuterClass {
    private int outerField = 10;

    public void outerMethod() {
        // 메소드 내부에 클래스 구현 가능
        class InnerClass {
            public void innerMehtod() {
                System.out.println("outerField = " + outerField);
            }
        }

        InnerClass inner = new InnerClass();
        inner.innerMehtod();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();
    }
}
