package com.example.day09.실습문제;

public class StringExam2 {
    //문자열을 입력받아서 공백의 개수를 리턴하는 메소드
    public static int spaceCount(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if((int)str.charAt(i) == 32)    // 공백 아스키 코드
                count++;
        }
        return count;
    }

    //문자열을 입력받아서 알파벳 개수를 리턴하는 메소드
    public static int alphaCount(String str) {
        String upper = str.toUpperCase();
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if(upper.charAt(i) >= 65 && upper.charAt(i) <= 90)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(spaceCount("test tset ts ttt")); //3
        System.out.println(alphaCount("test tset ts ttt")); //13
    }
}