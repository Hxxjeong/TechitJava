package com.example.day15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoServer {
    public static void main(String[] args) {
        // 1. UDP 통신 특정 포트 번호에 DatagramSocket 생성
        try (DatagramSocket socket = new DatagramSocket(8888);
        ) {
            while(true) {
                byte[] receiveData = new byte[1024];
                byte[] sendData;
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                String msg = new String(receivePacket.getData()).trim();

                // 클라이언트 정보
                InetAddress clientAddress = receivePacket.getAddress();
                int port = receivePacket.getPort();

                DatagramPacket sendPacket = new DatagramPacket(msg.getBytes(), msg.getBytes().length, clientAddress, port);
                socket.send(sendPacket);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
