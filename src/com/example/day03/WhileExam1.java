package com.example.day03;

public class WhileExam1 {
    public static void main(String[] args) {
        int i = 0;
        while(i++ < 10){
            System.out.println(i);
        }

        // 1부터 100까지 짝수의 합
        int sum = 0;
        int a = 0;
        while (a++ <= 100) {
            if (a % 2 == 0)
                sum += a;
        }
        System.out.println(sum);
    }
}
