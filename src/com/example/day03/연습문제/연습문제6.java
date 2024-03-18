package com.example.day03.연습문제;

import java.util.Scanner;

public class 연습문제6 {
    /*
 * 3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을
 * 출력하는 프로그램을 작성하시오.


입력예:18 -5 10
출력예:-5
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 세 개 입력하세요. 엔터로 구분됩니다.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = Integer.MAX_VALUE;

        if (min > a)
            min = a;
        else if (min > b)
            min = b;
        else if (min > c)
            min = c;

        System.out.println("입력한 수 중 가장 작은 수는 " + min + "입니다.");
    }
}
