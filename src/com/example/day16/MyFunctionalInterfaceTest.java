package com.example.day16;

class MyFunctionalInterfaceImpl implements MyFunctionalInterface {
    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }
}

public class MyFunctionalInterfaceTest {
    public static void main(String[] args) {
        // 익명 객체
        MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {
            @Override
            public void method1() {
                System.out.println("method1");
            }

            @Override
            public void method2() {
                System.out.println("method2");
            }
        };
        myFunctionalInterface.method1();

        // 인터페이스 구현 클래스
        MyFunctionalInterface myFunctionalInterface1 = new MyFunctionalInterfaceImpl();
        myFunctionalInterface1.method1();

        // 람다식 사용 (인터페이스의 추상 메소드가 두 개이기 때문에 오류 발생)
//        MyFunctionalInterface myFunctionalInterface2;
//        myFunctionalInterface2 = () -> System.out.println("hi");
//        myFunctionalInterface2.method1();
    }
}
