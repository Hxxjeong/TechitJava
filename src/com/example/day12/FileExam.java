package com.example.day12;

import java.io.File;

public class FileExam {
    public static void main(String[] args) {
        File dir = new File(".");  // 현재 디렉토리
        String[] files = dir.list();

        for(String s: files)
            System.out.println(s);
    }
}
