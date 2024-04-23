package com.example.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        // 처음에 아이디가 입력되어야 함 (args[0]으로 구현)
        if(args.length != 1) {
            System.out.println("사용법: java ChatClient id");
            System.exit(1);
        }

        try (Socket socket = new Socket("localhost", 9999);
             PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        ) {
            // 접속되면 서버에 id를 보냄
            pw.println(args[0]);

            // 네트워크에서 입력된 내용 담당 스레드
            new InputThread(socket, br).start();

            // 키보드로부터 입력받은 내용을 서버에 전송
            String msg;
            while((msg = keyboard.readLine()) != null) {
                pw.println(msg);
                if("/quit".equalsIgnoreCase(msg))
                    break;
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

class InputThread extends Thread {
    private Socket socket;
    private BufferedReader br;
    
    public InputThread(Socket socket, BufferedReader br) {
        this.socket = socket;
        this.br = br;
    }

    @Override
    public void run() {
        try {
            String msg;
            // 서버에서 받아서 콘솔에 출력
            while((msg = br.readLine()) != null) {
                System.out.println(msg);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if(socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}