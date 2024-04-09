package com.example.day07;

public abstract class Shape implements Drawable {
    abstract double calculateArea();
}

class Triangle extends Shape implements Drawable{
    int width;
    int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return (width * height)/2;
    }

    @Override
    public void draw() {
        System.out.println("This is Triangle.");
    }
}

class Rectangle extends Shape implements Drawable {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("This is rectangle.");
    }
}

class Circle extends Shape {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("This is Circle");
    }
}
