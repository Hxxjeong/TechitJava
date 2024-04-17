package com.example.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemIOExam {
    public static void main(String[] args) {
        // 키보드로부터 한 줄 입력받기 위한 IO 객체
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Input String: ");
            String str = br.readLine();
            System.out.println(str);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
