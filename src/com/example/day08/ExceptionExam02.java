package com.example.day08;

public class ExceptionExam02 {
    public static void main(String[] args) {
        System.out.println("Program start!");

        try {
            int i = Integer.parseInt(args[0]);
            System.out.println(10/i);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("0으로 나눌 수 없습니다.");
            e.printStackTrace();
        }

        System.out.println("Program end!");
    }
}
