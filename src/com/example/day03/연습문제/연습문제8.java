package com.example.day03.연습문제;

import java.util.Scanner;


public class 연습문제8 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("단을 입력하세요.");
        int dan = keyboard.nextInt();
        System.out.println("입력한 단은 "+dan+"입니다.");

        for (int i=1; i<=9; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, dan*i);
        }
    }

}