package com.example.day05;

public class MathBean {
    public void printClassName() {
        System.out.println("Class name is MathBean.");
        System.out.println(this.getClass().getName());  // 클래스 이름 불러오기
    }

    public void printNumber(int x) {
        System.out.println("정수 x = " + x);
    }

    public int getOne() {
        return 1;
    }

    public int plus(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        MathBean m = new MathBean();
        m.printClassName();
    }
}
