package com.example.day12;

import java.io.*;

public class IOExam02 {
    public static void main(String[] args) throws Exception {
        // 파일에서 한 줄씩 입력받아 문자 뒤에 hi 추가
        BufferedReader br = new BufferedReader(new FileReader("bufferedExam.txt"));
        PrintWriter pr = new PrintWriter("testHi.txt");

        String str;
        while((str = br.readLine()) != null) {
            pr.println(str + "hi");
        }

        br.close();
        pr.close();
    }
}
