package com.example.day06;

class Book {
    String title;

    public String info() {
        return "이 책의 제목은 " + title + "입니다.";
    }

    @Override
    public String toString() {
        return "이 책의 제목은 " + title + "입니다.";
    }
}

public class Test2 {
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "hi java";

        System.out.println(b.info());
        System.out.println(b.toString());
        System.out.println(b);  // 오버라이딩 되어 있기 때문에 객체의 toString()을 호출
    }
}
