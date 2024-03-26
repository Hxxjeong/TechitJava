package com.example.day06;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        Car car2 = new Car(100);
        Car car3 = new Car("HyunDai", 100);

        System.out.println(car.name);
        System.out.println(car.speed);

        Bus bus = new Bus();    // 부모 클래스의 생성자 실행 후 자식 클래스의 생성자 실행
    }
}
