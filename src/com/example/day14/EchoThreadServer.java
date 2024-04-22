package com.example.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 클라이언트 여러 개에 연결하는 서버
public class EchoThreadServer {
    public static void main(String[] args) {
        // 1. ServerSocket 생성 (1개 필요)
        try(ServerSocket serverSocket = new ServerSocket(9999);) {
            while (true) {
                Socket clientSocket = serverSocket.accept();    // 클라이언트 수만큼 반복 필요
                // 클라이언트마다 각자 실행할 수 있도록 만들어야 함 (스레드 사용)
                EchoThread thread = new EchoThread(clientSocket);
                thread.start();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class EchoThread extends Thread {
    private Socket socket;
    EchoThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println(socket.getInetAddress().getHostAddress() + " Connected");

        try(PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            String line;

            while((line = br.readLine()) != null) {
                System.out.println("클라이언트로부터 받은 메시지: " + line);
                pw.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
