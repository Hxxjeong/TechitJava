package com.example.day07;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape tri = new Triangle(3, 5);
        Shape rac = new Rectangle(5, 7);
        Shape cir = new Circle(4);

        System.out.println(tri.calculateArea());
        System.out.println(rac.calculateArea());
        System.out.println(cir.calculateArea());

        Drawable drawable = new Rectangle(10, 20);
        drawable.draw();
    }
}
