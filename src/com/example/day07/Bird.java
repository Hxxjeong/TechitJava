package com.example.day07;

abstract public class Bird {
    abstract public void sing();
}

class Pigeon extends Bird {
    @Override
    public void sing() {
        System.out.println("GUGUGU");
    }
}

class Sparrow extends Bird {
    @Override
    public void sing() {
        System.out.println("TTEETT");
    }
}

class Crow extends Bird {
    @Override
    public void sing() {
        System.out.println("GGGAAAAAA");
    }
}

abstract class Parrot extends Bird {
    public abstract void talk();
}

class ParrotName extends Parrot {

    // 모든 추상 클래스 구현 필요
    @Override
    public void sing() {
        
    }

    @Override
    public void talk() {

    }
}