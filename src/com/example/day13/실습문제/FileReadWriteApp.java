package com.example.day13.실습문제;

public class FileReadWriteApp {
    public static void main(String[] args) {
        Thread reader = new Thread(new FileReaderTask());
        Thread writer = new Thread(new FileWriterTask());

        reader.start();
        writer.start();
    }
}
