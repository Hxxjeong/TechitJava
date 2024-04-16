package com.example.day11;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookExam {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("김철수", "010-1234-5678");
        phoneBook.put("박영희", "010-9876-5432");
        phoneBook.put("이민지", "010-1472-5836");

        String minjiNum = phoneBook.get("이민지");
        System.out.println("이민지의 전화번호: " + minjiNum);

        System.out.println("전쳬 전화번호 목록");
        for(Map.Entry<String, String> entry: phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        phoneBook.remove("이민지");    // 삭제

        // 특정 값 존재 여부
        if(phoneBook.containsKey("김철수"))
            System.out.println("Contain!");

        if(phoneBook.containsValue("010-3365-9752"))
            System.out.println("Contain!");
        else
            System.out.println("NO :(");

        // Map이 비었는지 확인
        System.out.println(phoneBook.isEmpty());

        System.out.println(phoneBook.size());
    }
}
