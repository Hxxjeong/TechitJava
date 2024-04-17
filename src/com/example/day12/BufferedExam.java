package com.example.day12;

import java.io.*;

public class BufferedExam {
    public static void main(String[] args) {
        // 키보드로부터 여러 줄 입력받기 위한 IO 객체
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter("bufferedExam.txt");) {
            System.out.print("Input String: ");
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<5; i++) {
                sb.append(br.readLine());
            }
            pw.println(sb);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
