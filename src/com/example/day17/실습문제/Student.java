package com.example.day17.실습문제;

// 3번과 6번 같이 사용
public class Student {
    private String name;
    private int age;
    private int score;


    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }
}
