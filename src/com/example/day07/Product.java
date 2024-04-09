package com.example.day07;

import java.util.Objects;

public class Product {
    private String title;
    private int price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;  // getClass() 패키지를 포함한 클래스 이름
        Product product = (Product) o;
        return Objects.equals(title, product.title);    // 이름이 같으면 true
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
