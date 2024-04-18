package com.example.day13;

public class RunnableExam02 implements Runnable {
    String name;

    RunnableExam02(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("새로운 Thread 시작.");
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "스레드 실행 중: " + i);

            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("새로운 Thread 끝.");
    }

    public static void main(String[] args) {
        System.out.println("main thread 시작.");
        Runnable one = new RunnableExam02("영희");
        Thread thread = new Thread(one);

        Runnable two = new RunnableExam02("철수");
        Thread thread2 = new Thread(two);


        thread.start();
        thread2.start();
        System.out.println("main thread 끝.");
    }
}
