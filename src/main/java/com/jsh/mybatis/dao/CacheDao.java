package com.jsh.mybatis.dao;

import com.jsh.mybatis.entity.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @Author panjinsheng
 * @Create 2023/1/24 13:24
 * Description:
 */
public interface CacheDao {

    Emp getEmpByEid(@Param("eid") Integer eid);

    void insertEmp(Emp emp);
}
