package com.example.day12.실습문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserInputHandler {
    List<String> list = new ArrayList<>();
    // 입력한 내용을 리스트로 반환
    public List<String> getUserInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input text. If you wanna exit, Enter 'exit'.");
        while(true) {
            String input = br.readLine();
            if(input.equalsIgnoreCase("exit"))
                break;
            list.add(input);
        }
        br.close();
        return list;
    }
}
