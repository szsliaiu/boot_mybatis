package com.jsh.mybatis.dao;

import com.jsh.mybatis.entity.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author panjinsheng
 * @Create 2023/1/24 13:25
 * Description:
 */
@SpringBootTest
class CacheDaoTest {

    @Autowired
    private CacheDao cacheDao;

    @Test
    @Transactional(rollbackFor = Throwable.class)
    void getEmpByEid() {
        //第一次查询,缓存到一级缓存
        Emp empByEid = cacheDao.getEmpByEid(1);
        //第二次查询,直接读取一级缓存
        Emp empByEid2 = cacheDao.getEmpByEid(1);
        System.out.println(empByEid);
        System.out.println(empByEid2);
    }

    @Test
    void insertEmp() {
    }

    /**
     * 测试二级缓存效果
     * 需要*Mapper.xml开启二级缓存
     **/
    @Test
    public void testSecondCache(){
        System.out.println(cacheDao.getEmpByEid(1));
        System.out.println(cacheDao.getEmpByEid(1));
    }
}