package com.jsh.mybatis.dao;

import com.jsh.mybatis.entity.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author panjinsheng
 * @Create 2023/1/20 22:28
 * Description:
 */
@SpringBootTest
class EmpDaoTest {

    @Autowired
    private EmpDao empDao;

    @Test
    void getDeptAndEmp() {
        Emp deptAndEmp = empDao.getEmpAndDept(1);
        System.out.println(deptAndEmp);
    }

    @Test
    void getDeptAndEmpByStepTwo() {
        List<Emp> deptAndEmpByStepTwo = empDao.getDeptAndEmpByStepTwo(1);
        System.out.println(deptAndEmpByStepTwo);
    }
}