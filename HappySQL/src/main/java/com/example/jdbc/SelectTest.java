package com.example.jdbc;

import java.sql.*;

public class SelectTest {
    public static void main(String[] args) {
        // 1. 선언
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;    // 결과값 출력 객체

        String dburl = "jdbc:mysql://localhost/exampledb";  // 포트 생략 시 기본 포트인 3306 사용
        String user = "hj";
        String password = System.getenv("password");

        try {
            // 3. 접속
            conn = DriverManager.getConnection(dburl, user, password);

            // 4. 쿼리 작성
            ps = conn.prepareStatement("select * from dept");

            // 5. 쿼리 수행
            rs = ps.executeQuery();

            // 6. 결과 출력
            while(rs.next()) {
                System.out.print(rs.getInt(1) + "\t"); // "deptno"로 입력 가능
                System.out.print(rs.getString(2) + "\t");
                System.out.println(rs.getString(3) + "\t");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            // 2. 닫을 때는 선언 반대로
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if(ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
