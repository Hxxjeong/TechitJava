package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {
    public static void main(String[] args) {
        String dburl = "jdbc:mysql://localhost/exampledb";  // 포트 생략 시 기본 포트인 3306 사용
        String user = "hj";
        String password = "0000";

        String dname = "인사부";
        int deptno = 50;

        // 드라이버 로딩
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String sql = "update dept set dname = ? where deptno = ?";
        try (Connection conn = DriverManager.getConnection(dburl, user, password);
             PreparedStatement ps = conn.prepareStatement(sql)) {
                 ps.setInt(2, deptno);  // 두번째 ?에 deptno
                 ps.setString(1, dname);    // 첫번째 ?에 dname

            int count = ps.executeUpdate();
            System.out.println(count + "건 수정");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
