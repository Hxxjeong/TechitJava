package com.example.day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExam03 {
    public static void main(String[] args) throws FileNotFoundException {   // throws로 예외 처리
            FileInputStream file = new FileInputStream("abc");
    }
}
