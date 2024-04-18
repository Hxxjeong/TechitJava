package com.example.day13;

class MyThread extends Thread { // Thread를 상속받은 클래스는 Thread
    @Override
    public void run() {
        System.out.println("MyThread");
        // Thread가 해야 하는 일 구현
        for(int i=0; i<10; i++) {
            System.out.println("hi");
        }
        System.out.println("MyThread End");
    }
}

class OtherThread extends Thread { // Thread를 상속받은 클래스는 Thread
    @Override
    public void run() {
        System.out.println("OtherThread");
        // Thread가 해야 하는 일 구현
        for(int i=0; i<10; i++) {
            System.out.println("hello");
        }
        System.out.println("OtherThread End");
    }
}

public class ThreadExam {
    public static void main(String[] args) {
        System.out.println("main");

        MyThread mt = new MyThread();
        mt.start(); // 새 Thread(실행 흐름)이 생성됨 = 멀티스레드로 실행

        OtherThread ot = new OtherThread();
        ot.start();;

        for(int i=0; i<10; i++) {
            System.out.println("main hi");
        }

        System.out.println("end main");
    }
}
