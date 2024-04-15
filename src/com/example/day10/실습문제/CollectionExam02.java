package com.example.day10.실습문제;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//입력 처리
//Scanner 클래스를 사용하여 사용자로부터 입력을 받습니다.
//사용자가 0(더 이상입력하고 싶지 않을 때)을 입력할 때까지 반복하여 점수를 입력받습니다.
//입력 받은 점수는 ArrayList<Integer>에 저장됩니다.

//점수 유효성 검사
//입력 받은 점수가 0부터 100 사이가 아니면 예외를 발생시키고,
//에러 메시지로 "0-100사이의 숫자만 입력이 가능합니다."와 해당 점수를 출력합니다.
//예외 발생 시, 에러 스택 트레이스를 출력합니다.

//점수 리스트 관리
//입력된 0은 점수 리스트에서 제거합니다. (종료 신호로 사용됨)

//결과 출력
//입력된 점수를 모두 출력합니다.
//입력된 모든 점수의 합(총점)과 평균을 계산하여 출력합니다.
//평균은 정수로 계산하여 출력합니다.

public class CollectionExam02 {

    static class BoundException extends RuntimeException {
        public BoundException(String msg) {
            super(msg);
        }
    }

    // 입력 처리
    public static void inputNum(Scanner sc, List<Integer> list) {
        while (true) {
            int num = sc.nextInt();
            if(num == 0)
                break;
            else {
                // 점수 유효성 검사
                if(num<0 || num>100)
                    throw new BoundException("숫자는 0 이상 100 이하여야 합니다.");
                else
                    list.add(num);
            }
        }
    }

    // 점수 출력
    public static void printNum(List<Integer> list) {
        for(Integer i: list) {
            System.out.println(i);
        }
    }

    // 합과 평균 계산
    public static void sumAndAvg(List<Integer> list) {
        int sum = 0;
        for(Integer i: list)
            sum += i;
        double avg = (double)sum/list.size();

        System.out.println("합계: " + sum + ", 평균: " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. 0을 입력하면 종료합니다.");

        List<Integer> list = new ArrayList<>();
        inputNum(sc, list);
        printNum(list);
        sumAndAvg(list);
    }
}
