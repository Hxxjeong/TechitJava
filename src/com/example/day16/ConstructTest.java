package com.example.day16;

import java.util.function.BiFunction;
import java.util.function.Function;

class Car {
    String name;
    String speed;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, String speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return name + ", " + speed;
    }
}
public class ConstructTest {
    public static void main(String[] args) {
//        Function<String, Car> f = name -> new Car(name);
        Function<String, Car> f = Car::new;
        Car car = f.apply("hyundai");
        System.out.println(car);

        BiFunction<String, String, Car> f2 = Car::new;
        Car car2 = f2.apply("Tesla", "100");
        System.out.println(car2);
    }
}
