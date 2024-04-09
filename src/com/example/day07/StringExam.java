package com.example.day07;

public class StringExam {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        // str1과 str2는 같은 것을 가리킴
        if(str1 == str2)
            System.out.println("1 & 2 same");

        // str1과 str3은 다른 객체 (내용을 비교하려면 equals로 비교해야 함)
        if(str1.equals(str3))
            System.out.println("1 & 3 same");

        System.out.println(str1.concat(" world"));
    }
}
