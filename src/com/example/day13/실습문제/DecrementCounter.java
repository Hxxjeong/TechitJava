package com.example.day13.실습문제;

import java.util.Random;

public class DecrementCounter implements Runnable {
    @Override
    public void run() {
        Random r = new Random();
        for(int i=100; i>=1; i--) {
            System.out.println("Decrement: {" + i + "}");
            try {
                Thread.sleep(r.nextInt(1, 11));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
