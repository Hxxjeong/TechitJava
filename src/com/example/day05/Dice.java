package com.example.day05;

import java.util.Random;

public class Dice {
    public int face = 6;    // 면의 개수
    public int eye; // 주사위의 눈

    public Dice() {
//        this.face = 6;
        this(6);
    }

    public Dice(int face) {
        this.face = face;
    }

    public void roll() {
        Random r = new Random();
        eye = r.nextInt(face) + 1;
    }

    // 주사위를 n번 굴려서 나오는 눈이 x과 같은 횟수
    public static int diceGame(Dice dice, int totalCount, int eye) {
        int count = 0;
        for (int i=0; i<totalCount; i++) {
            dice.roll();
            if (dice.eye == eye)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        dice.roll();
        System.out.println(dice.eye);
        int count = diceGame(dice, 100, 3);
        System.out.println(count);
    }
}
