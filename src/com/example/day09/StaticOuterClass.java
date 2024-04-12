package com.example.day09;

public class StaticOuterClass {
    private static int outerField = 10;

    public static void outerMethod() {
    }

    static class InnerClass {
        public void innerMethod() {
            // 외부 클래스의 static 필드 사용 가능
            System.out.println("outerField = " + outerField);
        }
    }

    public static void main(String[] args) {
        StaticOuterClass.outerMethod();

        StaticOuterClass.InnerClass inner = new StaticOuterClass.InnerClass();
        inner.innerMethod();
    }
}
