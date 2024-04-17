package com.example.day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("b.txt");

        byte[] bytes = new byte[1024];  // buffer의 크기
        int n;  // 읽은 글자

//        while ((n = fis.read(bytes)) != -1) { // 파일의 끝
//            String str = new String(bytes);
//            System.out.println(str);
//            fos.write(bytes);
//        }

        while ((n = fis.read()) != -1) {
            System.out.println((char) n);
        }

        fos.close();
        fis.close();
    }
}
