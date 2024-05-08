package com.example.jdbc;

import java.util.List;

public class DeptDAORun {
    public static void main(String[] args) {
        DeptDAO deptDAO = new DeptDAO();
        DeptDTO deptDTO = new DeptDTO();

        deptDTO.setDeptno(60);
        deptDTO.setDname("개발부");
        deptDTO.setLoc("강남");

        // 삽입
//        boolean resultFlag = deptDAO.createDept(deptDTO);
//        if(resultFlag)
//            System.out.println("success!");
//        else
//            System.out.println("fail!");

        // 수정
//        int count = deptDAO.updateDept(deptDTO);
//        if(count > 0)
//            System.out.println("success!");
//        else
//            System.out.println("fail!");

        // 삭제
//        deptDAO.deleteDept(80);

        // 한 건 조회
//        DeptDTO resultDTO = deptDAO.findDeptById(20);
//        System.out.println(resultDTO);

        // 전체 조회
        List<DeptDTO> list = deptDAO.findDeptAll();
        for(DeptDTO dto: list) {
            System.out.println(dto);
        }
    }
}
