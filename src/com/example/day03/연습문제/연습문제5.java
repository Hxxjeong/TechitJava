package com.example.day03.연습문제;

import java.util.Scanner;

public class 연습문제5 {
    /*
 * 영문 대문자를 입력받아 'A'이면 “매우잘함”,
 * 'B'이면 “잘함”, 'C'이면 “보통임”,
 * 'D'이면 “노력요함”, 'F'이면 “낙제”,
 * 그 외 문자이면 “잘못입력”이라고 출력하는 프로그램을 작성하시오.
입력예:B

출력예:잘함
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("영문 대문자를 입력하세요");
        String score = sc.next();

        switch (score) {
            case "A":
                System.out.println("매우 잘함");
                break;
            case "B":
                System.out.println("잘함");
                break;
            case "C":
                System.out.println("보통임");
                break;
            case "D":
                System.out.println("노력요함");
                break;
            case "F":
                System.out.println("낙제");
                break;
            default:
                System.out.println("잘못입력");
        }
    }
}
