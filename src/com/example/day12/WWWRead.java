package com.example.day12;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class WWWRead {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.likelion.net/");
        InputStream in = url.openStream();

        // URL에서 입력받아서 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        String msg = null;

        while((msg = br.readLine()) != null) {
            System.out.println(msg);    // 페이지 소스 출력
        }
    }
}
