package com.example.day12;

import com.example.day10.Pair;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExam {
    public static void main(String[] args) {
        // 파일로부터 읽어서 파일에 쓰기

        // try-with-resource (Closeable 인퍼테이스를 구현받는 클래스는 close를 해줌)
        try (FileInputStream in = new FileInputStream("src/com/example/day12/ReadFile.java");
             FileOutputStream out = new FileOutputStream("outputFile.txt");) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            };
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
