package com.example.day02;

public class OpExam3 {
    public static void main(String[] args) {

        Book b = new Book();
        
        // instanceof: 타입이 맞는지 확인
        if(b instanceof Object)
            System.out.println("com.example.day02.Book is a Object");
    }
}
