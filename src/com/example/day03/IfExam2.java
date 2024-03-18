package com.example.day03;

public class IfExam2 {
    public static void main(String[] args) {
        int a = 10;
        int value = (a > 5) ? 20 : 30;
        System.out.println(value);

        char ch = 'a';
        if (ch == 'A')
            System.out.println("A");
        else if (ch == 'B') {
            System.out.println("B");
        } else if (ch == 'C') {
            System.out.println("C");
        }
        else
            System.out.println("not A, B, C");

        int day = 2;
        String dayString = switch (day) {
            case 1: yield "Monday";
            case 2: yield "Tuesday";
            case 3: yield "Wednesday";
            case 4: yield "Thursday";
            case 5: yield "Friday";
            default: yield "Unknown";
        };
        System.out.println(dayString);

    }
}
