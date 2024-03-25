package com.example.day05;

import java.util.Random;

public class Lotto {
    private Ball[] ball = new Ball[45];

    public Lotto() {
        // 1~45 숫자를 가진 볼을 기계에 넣어줌
        for (int i=0; i<ball.length; i++) {
            ball[i] = new Ball(i+1);
        }
    }

    public void mix() {
        for (int i=0; i<100; i++) {
            int x = (int) (Math.random() * ball.length);
            int y = (int) (Math.random() * ball.length);
            Ball tmp = ball[x];
            ball[x] = ball[y];
            ball[y] = tmp;
        }
    }

    public Ball getBall() {
        Ball balls;
        int index;
        do {
            index = (int) (Math.random() * ball.length)+1;
            balls = ball[index];
        } while (ball == null);
        
        ball[index] = null; // 꺼낸 인덱스
        return balls;
    }

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.mix();
        for(int i=0; i<6; i++) {
            Ball ball = lotto.getBall();
            System.out.println(ball.number);
        }
    }
}
