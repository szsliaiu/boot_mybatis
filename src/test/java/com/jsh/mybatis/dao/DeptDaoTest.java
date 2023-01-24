package com.jsh.mybatis.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jsh.mybatis.entity.Dept;
import com.jsh.mybatis.entity.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author panjinsheng
 * @Create 2023/1/22 22:38
 * Description:
 */
@SpringBootTest
class DeptDaoTest {

    @Autowired
    private EmpDao empDao;

    @Test
    void getDeptAndEmp() {
        PageHelper.startPage(2,4);
        List<Emp> all = empDao.getAll();
        PageInfo<Emp> pageInfo = new PageInfo<>(all, 3);
        all.forEach(emp -> System.out.println(emp));
        System.out.println(all);
    }
}