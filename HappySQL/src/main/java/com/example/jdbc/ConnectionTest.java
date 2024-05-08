package com.example.jdbc;
// 0. 라이브러리 추가 (dependencies)

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
    public static void main(String[] args) throws Exception {
        // 0-1. 드라이버 로딩
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dburl = "jdbc:mysql://localhost/exampledb";  // 포트 생략 시 기본 포트인 3306 사용
        String user = "hj";
        String password = System.getenv("password");

        // 1. 접속 객체 얻어오기
        Connection conn = DriverManager.getConnection(dburl, user, password);

        if(conn != null)
            System.out.println("success!!");
        else
            System.out.println("fail :(");

        String dname = "개발부";

        // Statement
        String sql = "insert into dept(deptno, dname) values (3, '" + dname + "')";
        // DBMS는 쿼리가 들어오면 번역. 같은 쿼리가 들어오면 이미 번역된 것 이용

        // PrepareStatement
        String sql2 = "insert into dept(deptno, dname) values (3, ?)";
        // 여기까지 번역
        // 값이 나중에 바뀌므로 매번 번역 X
    }
}
