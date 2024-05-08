package com.example.jdbc;

import java.sql.*;

public class DBUtil {
    // 필드가 없으므로 static이 더 유용

    // DB 접속
    public static Connection getConnection() throws Exception {
        Connection conn = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dburl = "jdbc:mysql://localhost/exampledb";
        String user = "hj";
        String password = database_password;

        conn = DriverManager.getConnection(dburl, user, password);

        return conn;
    }

    public static Connection getConnection(String url, String user, String password) throws Exception {
        Connection conn = null;
        Class.forName("com.mysql.cj.jdbc.Driver");

        conn = DriverManager.getConnection(url, user, password);

        return conn;
    }

    // DB Close
    public static void close(Connection conn) {
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void close(Connection conn, PreparedStatement ps) {
        if(ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        close(conn);
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
        if(rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        close(conn, ps);
    }
}
