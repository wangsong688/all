package com.wss.all;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    void function1(){
        int a = 1+1;
        //Assertions  断言
        Assertions.assertEquals(2,a);
    }
}
