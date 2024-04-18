package com.example.day13.실습문제;

import java.io.*;

public class FileReaderTask implements Runnable {
    private final String fileName = "input.txt";

    @Override
    public void run() {
        // 텍스트를 읽어 콘솔에 출력
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String str = br.readLine();
            while (str != null) {
                System.out.println(str);
                str = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
