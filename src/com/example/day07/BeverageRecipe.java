package com.example.day07;

public abstract class BeverageRecipe {
    // Template Method
    public final void prepareRecipe() { // 오버라이딩 불가
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Boil water.");
    }
    abstract void brew();
    void pourInCup() {
        System.out.println("Pour in cup.");
    }
    abstract void addCondiments();
}

class Coffee extends BeverageRecipe {

    @Override
    void brew() {
        System.out.println("Coffee to Espresso.");
    }

    @Override
    void addCondiments() {
        System.out.println("Add milk.");
    }
}

class Tea extends BeverageRecipe {

    @Override
    void brew() {
        System.out.println("Brew tea.");
    }

    @Override
    void addCondiments() {
        System.out.println("Add lemon.");
    }
}
