package com.example.day13;

public class RobotMain {
    public static void main(String[] args) {
        Robot robot = new Robot();
        RobotPlayer playerA = new RobotPlayer("A", robot);
        RobotPlayer playerB = new RobotPlayer("B", robot);
        RobotPlayer playerC = new RobotPlayer("C", robot);

        // A와 B는 동기화되어 있기 때문에 A가 다 실행되고 B가 실행됨
        playerA.start();
        playerB.start();
        playerC.start();
    }
}
