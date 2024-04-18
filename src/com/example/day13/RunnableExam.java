package com.example.day13;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable");
        // Thread가 해야 하는 일 구현
        for(int i=0; i<10; i++) {
            System.out.println("MyRunnable hi");
        }
        System.out.println("MyRunnable End");
    }
}

class OtherRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("OtherRunnable");
        // Thread가 해야 하는 일 구현
        for(int i=0; i<10; i++) {
            System.out.println("OtherRunnable hi");
        }
        System.out.println("OtherRunnable End");
    }
}

public class RunnableExam {
    public static void main(String[] args) {
        System.out.println("main");

        // Thread 생성
        Thread thread = new Thread(new MyRunnable());
        thread.start();

        Thread thread2 = new Thread(new OtherRunnable());
        thread2.start();

        for(int i=0; i<10; i++) {
            System.out.println("main hi");
        }

        System.out.println("end main");
    }
}
