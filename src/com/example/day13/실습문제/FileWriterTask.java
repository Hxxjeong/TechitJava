package com.example.day13.실습문제;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileWriterTask implements Runnable {
    private final String fileName = "output.txt";
    private List<String> strings;

    public FileWriterTask() {
        this.strings = new ArrayList<>();
    }

    @Override
    public void run() {
        // 사용자의 입력을 받아 파일에 쓰기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            while(true) {
                System.out.println("단어를 입력하세요. exit를 입력하면 저장됩니다.");
                String str = br.readLine();
                if(str.equals("exit")) {
                    saveToFile();
                    break;
                }
                else {
                    strings.add(str);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void saveToFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        for(String s: strings) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
