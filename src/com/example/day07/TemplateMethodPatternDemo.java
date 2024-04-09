package com.example.day07;

public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        Coffee c = new Coffee();
        Tea t = new Tea();

        c.prepareRecipe();
        System.out.println("=============");
        t.prepareRecipe();
    }
}
