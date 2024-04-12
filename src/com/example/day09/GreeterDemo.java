package com.example.day09;

public class GreeterDemo {
    public static void main(String[] args) {
        // 익명 객체를 사용하여 인터페이스 구현
        Greeter moringGreeter = new Greeter() {
            @Override
            public void greet() {
                System.out.println("Good morning!");
            }
        };

        Greeter eveningGreeter = new Greeter() {
            @Override
            public void greet() {
                System.out.println("Good evening!");
            }
        };

        moringGreeter.greet();
        eveningGreeter.greet();
    }
}
