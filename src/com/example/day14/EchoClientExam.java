package com.example.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientExam {
    public static void main(String[] args) throws Exception {
        // 1. Socket 객체 생성
        Socket socket = new Socket("127.0.0.1", 9999);
        System.out.println(9999 + " port Connected");

        // 2. 데이터 읽고 쓰기
        // 출력 통로
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

        // 입력 통로
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // 클라이언트가 키보드를 통해 입력하기 위한 통로
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line = keyboard.readLine()) != null) {
            if((line.equalsIgnoreCase("quit"))) {
                break;
            }
            pw.println(line);
            pw.flush();

            // 서버에서 받음
            String echo = br.readLine();
            System.out.println("서버로부터 응답받은 메시지: " + echo);
        }

        // 3. 연결 종료
        pw.close();
        br.close();
        keyboard.close();
        socket.close();
    }
}
