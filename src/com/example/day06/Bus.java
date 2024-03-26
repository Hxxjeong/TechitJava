package com.example.day06;

public class Bus extends Car {
    public Bus() {
        super();    // 생략되어 있음 (부모의 생성자)
        System.out.println("Bus()");
    }

    public Bus(String name) {
        this.name = name;
    }
}
