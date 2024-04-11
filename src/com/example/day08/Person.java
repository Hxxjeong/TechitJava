package com.example.day08;

public final class Person {
    private final int id;   // Setter 사용 불가, 생성자에 파라미터로 필요
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public final void print() { // 오버라이딩 불가
        System.out.println("Parent");
    }
}
