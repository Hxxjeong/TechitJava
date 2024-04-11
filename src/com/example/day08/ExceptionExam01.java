package com.example.day08;

public class ExceptionExam01 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        }
        catch (ArithmeticException e) { // catch 문이 실행되면 try 문은 실행되지 않음
            System.out.println("산술 예외 발생: " + e.getMessage());
            e.printStackTrace();
        }
        finally {   // 반드시 실행
            System.out.println("에외 처리 완료");
        }
    }
}
