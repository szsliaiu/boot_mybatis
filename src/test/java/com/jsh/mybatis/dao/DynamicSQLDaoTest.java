package com.jsh.mybatis.dao;

import com.jsh.mybatis.entity.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author panjinsheng
 * @Create 2023/1/22 23:39
 * Description:
 */
@SpringBootTest
class DynamicSQLDaoTest {

    @Autowired
    private DynamicSQLDao dynamicSQLDao;

    /**
     * 动态SQL：
     * 1、if：根据标签中test属性所对应的表达式决定标签中的内容是否需要拼接到SQL中
     * 2、where：
     * 当where标签中有内容时，会自动生成where关键字，并且将内容前多余的and或or去掉
     * 当where标签中没有内容时，此时where标签没有任何效果
     * 注意：where标签不能将其中内容后面多余的and或or去掉
     * 3、trim：
     * 若标签中有内容时：
     * prefix|suffix：将trim标签中内容前面或后面添加指定内容
     * suffixOverrides|prefixOverrides：将trim标签中内容前面或后面去掉指定内容
     * 若标签中没有内容时，trim标签也没有任何效果
     * 4、choose、when、otherwise，相当于if...else if...else
     * when至少要有一个，otherwise最多只能有一个
     * 5、foreach
     * collection:设置需要循环的数组或集合
     * item:表示数组或集合中的每一个数据
     * separator:循环体之间的分割符
     * open:foreach标签所循环的所有内容的开始符
     * close:foreach标签所循环的所有内容的结束符
     * 6、sql标签
     * 设置SQL片段：<sql id="empColumns">eid,emp_name,age,sex,email</sql>
     * 引用SQL片段：<include refid="empColumns"></include>
     */

    @Test
    public void testGetEmpByChoose(){
        List<Emp> list = dynamicSQLDao.getEmpByChoose(new Emp(null, "", null, "", ""));
        System.out.println(list);
    }

    @Test
    void getEmpByCondition() {
        List<Emp> list = dynamicSQLDao.getEmpByCondition(new Emp(null, "", null, "", null));
        System.out.println(list);
    }

    @Test
    void deleteMoreByArray() {
        int result = dynamicSQLDao.deleteMoreByArray(new Integer[]{6, 7, 8});
        System.out.println(result);
    }

    @Test
    void insertMoreByList() {
        Emp emp1 = new Emp(null,"a1",23,"男","123@qq.com");
        Emp emp2 = new Emp(null,"a2",23,"男","123@qq.com");
        Emp emp3 = new Emp(null,"a3",23,"男","123@qq.com");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        System.out.println(dynamicSQLDao.insertMoreByList(emps));
    }
}