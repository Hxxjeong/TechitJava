package com.example.day03.연습문제;

import java.util.Scanner;

public class 연습문제7 {
    /*
 * 4.5 이하의 평점을 입력받아 그 값에 따라 다음과 같이 출력하는 프로그램을 작성하시오.(switch ~ case문 사용)
단 입력는 0이상 4.5 이하이다.

4.0 이상 : “장학금을 받아가세요.”
3.0 이상 : “다음 학기를 준비하세요.”
2.0 이상 : “계절 학기에 등록하세요.”
2.0 미만 : “다음 학기에 재수강하세요.”


입력예:3.5

출력예:다음 학기를 준비하세요.
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("점수를 입력하세요. 점수는 0 이상 4.5 이하입니다.");
            double score = sc.nextDouble();

            if (score >= 0.0 && score <= 4.5) {
                switch ((int) score) {
                    case 4:
                        System.out.println("장학금을 받아가세요.");
                        break;
                    case 3:
                        System.out.println("다음 학기를 준비하세요.");
                        break;
                    case 2:
                        System.out.println("계절 학기에 등록하세요.");
                        break;
                    default:
                        System.out.println("다음 학기에 재수강하세요.");
                }
                break;
            }
            else
                System.out.println("잘못된 점수입니다.");
        }
    }
}
