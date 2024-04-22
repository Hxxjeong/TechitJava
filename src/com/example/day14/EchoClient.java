package com.example.day14;

import java.io.*;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        int port = 9999;
        String host = "127.0.0.1";

        try(Socket socket = new Socket(host, port);
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(port + "와 연결되었습니다.");
            String line;

            while((line = keyboard.readLine()) != null) {
                if("exit".equalsIgnoreCase(line.trim())) {
                    System.out.println("메시지 전송을 종료합니다.");
                    break;
                }

                pw.println(line);

                String echo = br.readLine();
                System.out.println("Message from Server: " + echo);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
