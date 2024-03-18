package com.example.day03.연습문제;

import java.util.Scanner;

public class 연습문제4 {
    /*
 * 두 개의 실수를 입력받아 모두 4.0 이상이면 "A",
 * 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.


입력예 : 4.3 3.5
출력예 :B

입력예 : 4.0 2.9
출력예 :C

 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("실수를 두 개 입력하세요. 엔터로 구분됩니다.");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a >= 4.0 && b >= 4.0)
            System.out.println("A");
        else if (a >= 3.0 && b >= 3.0)
            System.out.println("B");
        else
            System.out.println("C");
    }
}
