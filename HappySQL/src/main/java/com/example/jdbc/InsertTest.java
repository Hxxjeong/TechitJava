package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {
    public static void main(String[] args) {
        // 1. 필요한 객체 선언
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            // 3. 접속
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dburl = "jdbc:mysql://localhost/exampledb";  // 포트 생략 시 기본 포트인 3306 사용
            String user = "hj";
            String password = System.getenv("password");
            conn = DriverManager.getConnection(dburl, user, password);
            
            conn.setAutoCommit(false);  // auto commit 해제

            // 4. 쿼리
            String sql = "insert into dept(deptno, dname, loc) values (80, ?, ?)";
            ps = conn.prepareStatement(sql);

            ps.setString(1, "교육부");
            ps.setString(2, "ILSAN");

            // 5. 실행
            int count = ps.executeUpdate();
            System.out.println(count + "건 입력");

            conn.commit();  // insert 완료 후 commit
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            // 2. 닫기
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
