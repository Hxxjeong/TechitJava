package com.example.day10.실습문제;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordCollectionExam {

    public static void inputWords(Scanner sc, List<String> list) {
        while (true) {
            String str = sc.nextLine();

            if(str.equals("quit"))
                break;
            else
                list.add(str);
        }
    }

    public static void printWords(List<String> list) {
        for(String s: list)
            System.out.println(s);
    }

    public static void allWords(List<String> list) {
        int allSum = 0;
        for(String s: list)
            allSum += s.length();
        System.out.println("모든 단어의 개수: " + list.size() + ", 글자수의 합: " + allSum);
    }

    public static void findLongWord(List<String> list) {
        int max = list.get(0).length();
        String longStr = list.get(0);
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).length() > max) {
                longStr = list.get(i);
                max = list.get(i).length();
            }
        }
        System.out.println("가장 긴 단어: " + longStr + ", 그 길이: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.println("단어를 입력하세요. quit을 입력하면 종료합니다.");
        inputWords(sc, list);

        // 입력한 단어 모두 출력
        printWords(list);

        // 모든 단어의 개수와 글자 수의 합
        allWords(list);

        // 단어 중 가장 긴 단어
        findLongWord(list);
    }
}
