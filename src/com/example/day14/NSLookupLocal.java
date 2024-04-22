package com.example.day14;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NSLookupLocal {
    public static void main(String[] args) {
        try{
            InetAddress local = InetAddress.getLocalHost();
            System.out.println(local.getHostName());
            System.out.println(local.getHostAddress());

            System.out.println("byte[] IP Address");
            byte[] ip = local.getAddress();
            for(byte b: ip) {
                System.out.println(b & 0xFF);   // 부호 없는 바이트로 출력
            }
        }
        catch (UnknownHostException e) {
            e.printStackTrace();
        }

        System.out.println("=======================");

        try {
            InetAddress address = InetAddress.getByName("www.naver.com");
            System.out.println(address.getHostAddress());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
