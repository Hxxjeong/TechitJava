package com.example.day12.실습문제;

import java.io.*;

public class PhoneNumberInput {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new FileWriter("phone.txt"));
        System.out.println("이름, 전화번호를 3번 입력해주세요.");
        for(int i=0; i<3; i++) {
            System.out.println("name: ");
            pw.println(br.readLine());
            System.out.println("phone: ");
            pw.println(br.readLine());
        }
        br.close();
        pw.close();
        System.out.println("전화번호부가 phone.txt에 저장되었습니다.");
    }
}
