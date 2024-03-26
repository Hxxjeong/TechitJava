package com.example.day06.실습문제;

public class ElectricCar extends Car {
    int batteryCapaticy;

    public ElectricCar(String brand, String model, int year, int batteryCapaticy) {
        super(brand, model, year);
        this.batteryCapaticy = batteryCapaticy;
    }

    public void displayInfo() {
        System.out.println("자동차 정보 {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", batteryCapaticy=" + batteryCapaticy +
                '}');
    }
}
