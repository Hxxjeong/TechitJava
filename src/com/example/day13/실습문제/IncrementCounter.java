package com.example.day13.실습문제;

import java.util.Random;

public class IncrementCounter implements Runnable {
    @Override
    public void run() {
        Random r = new Random();
        for(int i=1; i<=100; i++) {
            System.out.println("Increment: {" + i + "}");
            try {
                Thread.sleep(r.nextInt(1, 11));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
