package com.wss.all;

import com.wss.all.unit.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.mockito.Mockito.when;

/**
 * @ClassName : Test4
 * @Description : Mock  模拟数据
 * @Author : 王松松
 * @Date: 2020-02-01 21:53
 */

@SpringBootTest
public class Test4 {

//    @MockBean
    @SpyBean    //没有mock的值的时候，直接使用原来的对象
    Service service;

    @Test
    void t1() {
        when(service.add(1,1)).thenReturn(3);
//        when(service.jian(3,1)).thenReturn(3);
        int add = service.add(1, 1);
        int jian = service.jian(3, 1);
        Assertions.assertEquals(3,add);
        Assertions.assertEquals(2,jian);
    }
}
