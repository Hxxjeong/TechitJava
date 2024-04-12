package com.example.day09;

public class Smartphone {
    // 내부 인터페이스
    public interface Camera {
        void takePhoto();
    }

    // 내부 인터페이스를 구현하는 내부 클래스
    public class BasicCamera implements Camera {
        @Override
        public void takePhoto() {
            System.out.println("Take a picture");
        }
    }

    public void activateCamera() {
        Camera camera = new BasicCamera();
        camera.takePhoto();
    }

    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.activateCamera();
    }
}
