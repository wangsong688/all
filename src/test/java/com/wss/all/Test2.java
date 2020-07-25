package com.wss.all;

import org.junit.jupiter.api.*;

public class Test2 {

    @BeforeAll
    public static void beforeAll() {
        //只初始化1次
        System.out.println("init one++++++++");
    }

    @AfterAll
    public static void afterAll() {
        //只初始化1次
        System.out.println("after one--------");
    }

    @BeforeEach
    public void each() {
        //每个方法之前都运行都方法
        System.out.println("------------init--------");
    }

    @AfterEach
    public void each1() {
        //每个方法之后都运行都方法
        System.out.println("------------after-------");
    }


    @Test
    public void t1() {
        System.out.println(123);
    }

    @Test
    public void t2() {
        System.out.println(456);
    }

}
