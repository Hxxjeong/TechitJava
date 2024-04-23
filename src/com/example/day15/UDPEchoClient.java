package com.example.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoClient {
    public static void main(String[] args) {
        // 클라이언트는 따로 포트를 열 필요 없음
        try (DatagramSocket clientSocket = new DatagramSocket();
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             ) {
            // 서버의 주소 설정
            InetAddress ipAddress = InetAddress.getByName("localhost");
            byte[] sendData;
            byte[] receiveData = new byte[1024];

            // 키보드로 입력 받기
            System.out.println("Input Send Message: ");
            String message = br.readLine();

            // 서버로 메시지 보내기
            DatagramPacket sendPacket = new DatagramPacket(message.getBytes(), message.getBytes().length, ipAddress, 8888);
            clientSocket.send(sendPacket);

            // 서버로부터 받기
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            String receiveMsg = new String(receivePacket.getData()).trim();

            System.out.println("Message: " + receiveMsg);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
