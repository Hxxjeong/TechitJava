package com.example.day02;

public class Rectangle {

    // 필드 (전역변수, 초기화하지 않아도 됨)
    // int i;
    
    public static void main(String[] args) {
        // 지역변수, 초기화 필수
        int i = 1;

        while (i <= 10) {
            System.out.println("**********");
            i += 1;
        }

        System.out.println();

        for (int j=1; j<=10; j++) {
            System.out.println("**********");
        }

        for (int k=0; k<5; k++) {
            for (int l=0; l<5; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
