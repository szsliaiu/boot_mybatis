package com.jsh.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author panjinsheng
 * @Create 2023/1/20 12:02
 * Description:
 */
@SpringBootApplication
@MapperScan("com.jsh.mybatis.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}