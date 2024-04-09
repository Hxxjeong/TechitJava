package com.example.day07;

public class BirdTest {
    public static void main(String[] args) {
        Bird b1 = new Crow();
        Bird b2 = new Sparrow();
        Bird b3 = new Pigeon();

        b1.sing();
        b2.sing();
        b3.sing();
    }
}
