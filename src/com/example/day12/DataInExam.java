package com.example.day12;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInExam {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));

        System.out.println(dis.readBoolean());
        System.out.println(dis.readByte());
        System.out.println(dis.readChar());
        System.out.println(dis.readDouble());

        dis.close();
    }
}
