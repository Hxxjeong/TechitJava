package com.example.day16;

public class FinalVariableExam {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("lambda에서 final로 사용");

        Runnable r = () -> {
            System.out.println("x: " + x);
        };
        
//        x = 20;   // run()에서 오류 발생

        r.run();
    }
}
