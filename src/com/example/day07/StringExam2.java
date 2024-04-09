package com.example.day07;

public class StringExam2 {
    public static void main(String[] args) {
        String str = "java programming";

        System.out.println(str.charAt(2));
        System.out.println(str.substring(3, 6));

        String str2 = "   abc   ";
        System.out.println(str2.trim());
    }
}
