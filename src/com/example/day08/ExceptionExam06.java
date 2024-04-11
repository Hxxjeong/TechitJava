package com.example.day08;

import java.util.Scanner;

public class ExceptionExam06 {
    public void inputScore(int score) {
        if (score<0 || score>100) {
//            System.out.println("정수는 0~100 사이만 입력할 수 있습니다.");
//            return;
            throw new MyException("정수는 0~100 사이만 입력할 수 있습니다.");
        }

        System.out.println(score);
    }

    public static void main(String[] args) {
        ExceptionExam06 ex06 = new ExceptionExam06();

        Scanner sc = new Scanner(System.in);
        System.out.println("input: ");
        try {
            ex06.inputScore(sc.nextInt());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
