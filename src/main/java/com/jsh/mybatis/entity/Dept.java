package com.jsh.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Author panjinsheng
 * @Create 2023/1/20 21:47
 * Description:
 */

@Data
@TableName("t_dept")
public class Dept implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer did;

    private String deptName;

    private List<Emp> emps;
}