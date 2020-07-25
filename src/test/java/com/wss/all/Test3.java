package com.wss.all;

import com.wss.all.unit.Service;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName : Test3
 * @Description : 测试springboot项目
 * 使用  @SpringBootTest 和 @Autowired 配合使用
 * @Author : 王松松
 * @Date: 2020-02-01 21:48
 */
@SpringBootTest
public class Test3 {

    @Autowired
    Service service;

    @Test
    public void t1() {
        int add = service.add(1, 2);
        Assertions.assertEquals(3, add);
    }

}
