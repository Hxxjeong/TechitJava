package com.example.day12.실습문제;

public class PhoneNumber {
    String name;
    String number;

    public PhoneNumber(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + " " + number;
    }
}
