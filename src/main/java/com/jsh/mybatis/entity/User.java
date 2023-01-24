package com.jsh.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author makejava
 * @since 2023-01-20 11:52:54
 */
@TableName("t_user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private String username;
    
    private String password;
    
    private Integer age;
    
    private String sex;
    
    private String email;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

