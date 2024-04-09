package com.example.day07;

public class Child extends Parent {

    public Child() {
        super("no name", 0);    // 부모의 생성자
    }

    // 메소드는 오버라이딩 되면 자식의 메소드를 사용
    @Override
    public String getName() {
        System.out.println("Child getName()");
        return super.getName(); // 부모의 getter
    }

    @Override   // Object의 toString
    public String toString() {
        return "I'm Child.";
    }
}
