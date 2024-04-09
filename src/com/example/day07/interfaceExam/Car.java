package com.example.day07.interfaceExam;

public class Car implements Vehicle {

    private int speed;

    @Override
    public void acc(int speed) {
        this.speed += speed;
        if(this.speed > MAX_SPEED) {
            this.speed = MAX_SPEED;
        }
        System.out.println("현재 속도: " + this.speed);
    }

    @Override
    public void dec(int speed) {
        this.speed -= speed;
        if(this.speed < 0) {
            this.speed = 0;
        }
        System.out.println("현재 속도: " + this.speed);
    }
}
