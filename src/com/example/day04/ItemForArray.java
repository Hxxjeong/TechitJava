package com.example.day04;

public class ItemForArray {
    
    // 필드 생성
    private int price;
    private String name;

    // 생성자
    public ItemForArray(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
