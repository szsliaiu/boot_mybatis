package com.jsh.mybatis.dao;

import com.jsh.mybatis.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author panjinsheng
 * @Create 2023/1/20 12:02
 * Description:
 */
@SpringBootTest
class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    void insert() {
        User user = new User();
        user.setAge(21);
        user.setEmail("654@qq.com");
        user.setUsername("李四");
        user.setPassword("ww");
        user.setSex("男");
        userDao.insert(user);
    }

    @Test
    void getUserByLike() {
        List<User> user = userDao.getUserByLike("user");
        System.out.println(user);
    }
}