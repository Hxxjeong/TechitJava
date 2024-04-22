package com.example.day14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerExam {
    public static void main(String[] args) throws Exception {
        // 1. ServerSocket 생성
        ServerSocket server = new ServerSocket(9999);
        System.out.println("Ready Server.");

        // 2. 클라이언트 연결 수락
        Socket socket = server.accept();    // 클라이언트의 소켓을 얻어옴
        System.out.println(socket.getInetAddress().getHostAddress() + " Connected");

        // 3. 데이터 읽고 쓰기
        // 입력 통로
        // 클라이언트의 출력 = 서버의 입력
        OutputStream out = socket.getOutputStream();    // 클라이언트의 출력
        InputStream in = socket.getInputStream();   // 클라이언트의 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        // 출력 통로
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));

        String line = null;

        while((line = br.readLine()) != null) {
            System.out.println("클라이언트로부터 응답받은 메시지: " + line);

            // 클라이언트가 보낸 메시지를 다시 클라이언트에게 보냄
            pw.println(line);
            pw.flush();
        }

        // 4. 연결 종료
        pw.close();
        br.close();
        socket.close();
    }
}
