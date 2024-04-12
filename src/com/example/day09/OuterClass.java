package com.example.day09;

public class OuterClass {
    private int outerField = 10;
    private InnerClass innerClass;  // 클래스 타입의 필드 선언 가능

    public void outerMethod() {
        // 내부 클래스의 메소드 사용 가능
        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }

    class InnerClass {
        public void innerMethod() {
            // 외부 클래스의 필드 사용 가능
            System.out.println("outerField = " + outerField);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();
    }
}
