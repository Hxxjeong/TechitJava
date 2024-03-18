package com.example.day02;

public class Book {
    
    // 객체 추상화
    private String title;
    private int price;

    public String getTitle() {
        return this.title;  // field의 title을 return
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
