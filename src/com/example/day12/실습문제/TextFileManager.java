package com.example.day12.실습문제;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFileManager {
    private String filePath;

    public TextFileManager(String filePath) {
        this.filePath = filePath;
    }

    // 파일로 변환
    public void writeToFile(List<String> userInput) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        for(String s: userInput) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }

    // 파일에서 읽기
    public List<String> readFromFile() throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String str = br.readLine();
        while(str != null) {
            list.add(str);
            str = br.readLine();
        }
        br.close();
        return list;
    }
}
