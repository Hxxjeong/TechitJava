package com.example.day14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        int port = 9999;
        // PrintWriter 두번짜 인자 자동 flush 여부
        try(ServerSocket serverSocket = new ServerSocket(port);
            Socket clientSocket = serverSocket.accept();
            PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) {

            System.out.println("localhost와 연결되었습니다.");
            String line;

            while((line = in.readLine()) != null) {
                out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
