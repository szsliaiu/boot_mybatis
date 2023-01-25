package com.jsh.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TEmp)实体类
 *
 * @author makejava
 * @since 2023-01-20 21:56:04
 */
@Data
@TableName("t_emp")
public class Emp implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer eid;
    
    private String empName;
    
    private Integer age;
    
    private String sex;
    
    private String email;
    
    private Integer did;

    private Dept dept;

    public Emp(Integer eid, String empName, Integer age, String sex, String email) {
        this.eid = eid;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    public Emp(Integer eid, String empName, Integer age, String sex, String email, Integer did, Dept dept) {
        this.eid = eid;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.did = did;
        this.dept = dept;
    }

    public Emp() {
    }
}

