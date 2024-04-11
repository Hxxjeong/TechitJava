package com.example.day08;

public class MyException extends RuntimeException { // Exception을 상속받은 경우 06에서 throw 작성
    public MyException() {  // 부모의 getMessage
        super("점수는 0~100 사이여야 합니다.");
    }

    public MyException(String msg) {
        super(msg);
    }
}
