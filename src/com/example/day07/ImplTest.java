package com.example.day07;

public class ImplTest {
    public static void main(String[] args) {
        Ainter ainter = new DImpl();
        Cinter cinter = new DImpl();

        // 자신이 정의한 것만 사용 가능
        ainter.aMehtod();
        ainter.same();

        Binter binter = new DImpl();
        Dinter dinter = new DImpl();

        binter.bMethod();
        binter.aMehtod();

        Ainter ainter2 = new AImpl();
        ((AImpl)ainter2).say(); // 클래스에 구현된 메소드는 형변환 필요

        System.out.println(Ainter.NUM);
    }
}
