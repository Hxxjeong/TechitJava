package com.example.day13;

class SumThread extends Thread {
    @Override
    public void run() {
        // 계산을 담당하는 스레드

        System.out.println("계산 종료");
    }
}

public class JoinExam {
    public static void main(String[] args) throws InterruptedException {
        SumThread sumThread = new SumThread();
        sumThread.start();    // 계산

        sumThread.join();   // SumThread의 종료를 기다림

        System.out.println("SumThread의 계산 결과: ");
    }
}
