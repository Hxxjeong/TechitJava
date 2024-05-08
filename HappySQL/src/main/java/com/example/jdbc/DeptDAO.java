package com.example.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {  // JPA의 Repository

    // 삽입
    public boolean createDept(DeptDTO deptDTO) {
        Connection conn = null;
        PreparedStatement ps = null;
        int count = 0;

        try {
            // 접속
            conn = DBUtil.getConnection();

            String sql = "INSERT INTO dept(deptno, dname, loc) VALUES (?, ?, ?)";
            ps = conn.prepareStatement(sql);

            ps.setInt(1, deptDTO.getDeptno());
            ps.setString(2, deptDTO.getDname());
            ps.setString(3, deptDTO.getLoc());

            count = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps);
        }
        return count > 0;
    }

    // 수정
    public int updateDept(DeptDTO deptDTO) {
        Connection conn = null;
        PreparedStatement ps = null;
        int count = 0;

        try {
            conn = DBUtil.getConnection();

            String sql = "UPDATE dept set dname = ?, loc = ? where deptno = ?";
            ps = conn.prepareStatement(sql);

            ps.setInt(3, deptDTO.getDeptno());
            ps.setString(1, deptDTO.getDname());
            ps.setString(2, deptDTO.getLoc());

            count = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps);
        }
        return count;
    }

    // 삭제
    public void deleteDept(int deptno) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = DBUtil.getConnection();
            ps = conn.prepareStatement("delete from dept where deptno = ?");
            ps.setInt(1, deptno);

            ps.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            DBUtil.close(conn, ps);
        }
    }

    // 모두 조회
    public List<DeptDTO> findDeptAll() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<DeptDTO> list = new ArrayList<>();

        try {
            conn = DBUtil.getConnection();

            String sql = "select * from dept";
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();

            while(rs.next()) {
                DeptDTO deptDTO = new DeptDTO();

                deptDTO.setDeptno(rs.getInt("deptno"));
                deptDTO.setDname(rs.getString("dname"));
                deptDTO.setLoc(rs.getString("loc"));

                list.add(deptDTO);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            DBUtil.close(conn, ps, rs);
        }

        return list;
    }

    // 한 건 조회
    public DeptDTO findDeptById(int deptno) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        DeptDTO deptDTO = null;

        try {
            conn = DBUtil.getConnection();

            String sql = "select * from dept where deptno = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, deptno);

            rs = ps.executeQuery();

            // 하나의 튜플만 출력하기 때문에 while 쓸 필요 X
            if(rs.next()) {
                deptDTO = new DeptDTO();

                deptDTO.setDeptno(rs.getInt("deptno"));
                deptDTO.setDname(rs.getString("dname"));
                deptDTO.setLoc(rs.getString("loc"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            DBUtil.close(conn, ps, rs);
        }

        return deptDTO;
    }

    // 조건에 맞는 조회
}
