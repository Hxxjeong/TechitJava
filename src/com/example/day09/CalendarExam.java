package com.example.day09;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExam {

    public static void printCalendar(int year, int month) {
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, 1);

        // 해당 월의 마지막 날
        int lastOfDate = c.getActualMaximum(Calendar.DATE);

        // 해당 월의 첫 요일
        int week = c.get(Calendar.DAY_OF_WEEK);

        System.out.println("일\t월\t화\t수\t목\t금\t토");
        // 첫날 출력 전까지 공백
        for(int i=1; i<week; i++) {
            System.out.print("\t");
        }

        for(int i=1; i<=lastOfDate; i++) {
            System.out.print(i + "\t");
            if (week%7 == 0)
                System.out.println();
            week++;
        }
    }

    public static void main(String[] args) {
        // 년, 월을 입력받아 해당 월의 달력 출력
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("연도를 입력하세요.");
        int year = sc.nextInt();
        System.out.println("월을 입력하세요.");
        int month = sc.nextInt();

        printCalendar(year, month);
    }
}
