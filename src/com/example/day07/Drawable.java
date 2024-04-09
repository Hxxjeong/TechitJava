package com.example.day07;

public interface Drawable {
    
    // default 메소드는 오버라이딩 가능
    default public void draw() {
        System.out.println("Draw Shape.");
    }
}
