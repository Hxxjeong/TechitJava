package com.example.day12;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutExam {
    public static void main(String[] args) throws Exception {
        // Java의 데이터 타입으로 파일에 출력
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(("data.txt")));

        dos.writeBoolean(true);
        dos.writeByte(Byte.MAX_VALUE);
        dos.writeChar('a');
        dos.writeDouble(2.1);

        dos.close();
    }
}
