package com.example.day10.box;

public class ColorBox<T, C> extends Box<T> {
    private C color;

    public ColorBox(T content, C color) {
        super(content);
        this.color = color;
    }

    public C getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorBox with color: " + color + "\nand containing: " + getContent();
    }

    public static void main(String[] args) {
        ColorBox<String, String> colorBox = new ColorBox<>("hi", "black");
        System.out.println(colorBox);
    }
}
