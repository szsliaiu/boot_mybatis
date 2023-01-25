package com.jsh.mybatis.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jsh.mybatis.entity.Emp;
import org.apache.ibatis.session.RowBounds;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 通过分页插件pagehelper
     */
    @Test
    void testPageHelper() {
        PageHelper.startPage(2, 2);
        List<Emp> emps = empDao.getEmpByPageHelper();
        PageInfo<Emp> pageInfo = new PageInfo<>(emps, 4);
        System.out.println(pageInfo);
        System.out.println("===================");
        System.out.println(emps);
    }

    /**
     * 通过limit分页查询
     */
    @Test
    void getUserByLimit() {
        Map<String, Integer> map = new HashMap<>();
        map.put("offset", 1);
        map.put("pageSize", 2);
        List<Emp> empByLimit = empDao.getEmpByLimit(map);
        System.out.println(empByLimit);
    }

    /**
     * 通过Rowbounds
     */
    @Test
    void getUserByRowBounds() {
        RowBounds rowBounds = new RowBounds(1, 2);
        List<Emp> empByRowBounds = empDao.getEmpByRowBounds(rowBounds);
        System.out.println(empByRowBounds);
    }
}