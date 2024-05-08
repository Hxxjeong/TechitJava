package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {
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

            // 4. 쿼리
            String sql = "delete from dept where deptno = 50";
            ps = conn.prepareStatement(sql);

            // 5. 실행
            int count = ps.executeUpdate();
            System.out.println(count + "건 삭제");
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

/*
public class DeleteTest {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost/exampledb";
        String user = "carami";
        String password = "kang1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String sql = "delete from dept where deptno=60";
        try(Connection conn = DriverManager.getConnection(dbUrl,user,password);
            PreparedStatement ps = conn.prepareStatement(sql);
                ){
            int count = ps.executeUpdate();
            System.out.println(count+"건 삭제했습니다.");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
 */
