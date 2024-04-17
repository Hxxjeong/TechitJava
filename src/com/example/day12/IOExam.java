package com.example.day12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExam {
    public static void main(String[] args) throws IOException {
        // 키보드로부터 한줄씩 입력 받아서 콘솔에 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new FileReader("a.txt"));
        String s = br.readLine();
        System.out.println(s);
        System.out.println(br2.readLine());

        br.close();
        br2.close();
    }
}
