package com.jsh.mybatis.dao;

import com.jsh.mybatis.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * (TEmp)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-20 21:56:04
 */
@Mapper
public interface EmpDao {

    /**
     * 查询员工以及员工所对应的部门信息
     */
    Emp getEmpAndDept(@Param("eid") Integer eid);

    /**
     * 通过分步查询查询员工以及员工所对应的部门信息
     * 分步查询第一步：查询员工信息
     */
    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);

    /**
     * 通过分步查询查询部门以及部门中所有的员工信息
     * 分步查询第二步：根据did查询员工信息
     */
    List<Emp> getDeptAndEmpByStepTwo(@Param("did") Integer did);

    /**
     * 查询指定行数据
     *
     * @param Emp 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Emp> queryAllByLimit(Emp Emp, @Param("pageable") Pageable pageable);

    /**
     * 通过分页插件pageHelper
     * @return
     */
    List<Emp> getEmpByPageHelper();

    /**
     * 通过limit分页查询
     * @param map
     * @return
     */
    List<Emp> getEmpByLimit(Map<String,Integer> map);

    /**
     * 通过Rowbounds
     * @param rowBounds
     * @return
     */
    List<Emp> getEmpByRowBounds(RowBounds rowBounds);
}

